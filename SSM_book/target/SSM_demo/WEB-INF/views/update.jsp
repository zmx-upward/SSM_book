<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>编辑</title>

</head>

<body>
<h1>修改书籍信息</h1>
<form action="<%= path %>/update" method="post">
    <input type="hidden" name="id" value="${book.id }"/>
    书籍名称：<input type="text" name="name" value="${book.name }"/>
    书籍数量：<input type="text" name="num" value="${book.num }"/>
    <input type="submit" value="编辑"/>
</form>
</body>

</html>