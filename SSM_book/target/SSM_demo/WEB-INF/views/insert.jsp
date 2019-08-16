<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/6
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>添加书籍</title>
</head>
<body>
添加书籍:
<br>
<form action="<%= path %>/insert" method="post">
    <table>
        <tr>
            <td colspan="2">
                书籍名称：
                <input name="name" value="${name}"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                书籍数量：
                <input name="num" value="${num}"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="确定"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
