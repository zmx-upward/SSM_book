<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/6
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
书籍列表:
<br>

<table>
    <tr>
        <th>编号</th>
        <th>书名</th>
        <th>数量</th>
    </tr>
    <tbody>
    <c:forEach items="${book}" var="books" >
        <tr>
            <td>${books.id}</td>
            <td>${books.name}</td>
            <td>${books.num}</td>
            <td>
                <a href="<%=basePath%>getBook?id=${books.id}">编辑</a>
                <a href="<%=basePath%>delete?id=${books.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
