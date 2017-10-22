<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: home
  Date: 2017/10/13
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>hello</title>
</head>
<body>
<h1>选择一种方法来操数据库</h1>

<form action="${ctx}/user" method="post">
    <input type="submit" value="添加用户" style="border: solid 1px deepskyblue">
</form>

<form action="${ctx}/user" method="get">
    通过id查找<input type="number" name="id"><br>
    <input type="submit" value="操作用户" style="border: solid 1px deepskyblue">
</form>

</body>
</html>
