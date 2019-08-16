package com.zmx.controller;

import com.zmx.entity.Book;
import com.zmx.service.BookService;
import com.zmx.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    //    请求url

    /**
     * 查询
     * @return
     */
    @RequestMapping(value = "/books")
//    @GetMapping("/listAll")
    public ModelAndView getList(){
//        页面的名字
        ModelAndView mv = new ModelAndView("list");
//        获取数据
        List<Book> list = bookService.listAll();
        mv.addObject("book",list);
        return mv;
    }

    /**
     * 根据id查询
     * @return
     */
    @RequestMapping("/getBook")
    public String getBook(int id,HttpServletRequest request,Model model){
        request.setAttribute("book", bookService.findById(id));
        model.addAttribute("book", bookService.findById(id));
        return "/update";
    }

//    @RequestMapping(value = "/insert")
////    @GetMapping("/listAll")
//    public String insert(HttpServletRequest request, HttpSession session, String name,Integer num){
//
//
//
//
//        return "redirect:/insert"; //重定向
//    }

    /**
     * 添加操作
     * @param request
     * @param session
     * @param name
     * @param num
     * @return
     */
    @RequestMapping(value = "/insert")
    public ModelAndView insert(HttpServletRequest request, HttpSession session, String name,Integer num){
        if (name != null && num != null) {
            Book book = new Book();
            book.setName(name);
            book.setNum(num);
            bookService.insert(book);
        }
        ModelAndView mv = new ModelAndView("insert");
        return mv;
    }

    /**
     *编辑
     */
//    @RequestMapping("/updateBook")
//    public String updateBook(Book book, HttpServletRequest request, Model model){
//        if(bookServiceImpl.update(book)){
//            book = bookServiceImpl.findById(book.getId());
//            request.setAttribute("book", book);
//            model.addAttribute("book", book);
//            return "redirect:/books";
//        }else{
//            return "/error";
//        }
//    }
    @RequestMapping("/update")
    public String updateBook(Book book, HttpServletRequest request){
        bookService.update(book);
        return "redirect:/books";
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public String delete(int id, HttpServletRequest request){
        bookService.delete(id);
        return "redirect:/books";
    }
}