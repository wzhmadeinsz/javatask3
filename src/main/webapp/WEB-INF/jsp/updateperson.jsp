<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: home
  Date: 2017/10/13
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${ctx}/user/${id}" method="post" accept-charset="UTF-8" onsubmit="document.charset='UTF8';">
    ID:<input type="text" name="id"><br>
    名字：<input type="text" name="name"><br>
    QQ：<input type="text" name="qq"><br>
    报到日期：<input type="text" name="date"><br>
    毕业于：<input type="text" name="graduate"><br>
    愿望：<input type="text" name="wish"><br>
    师兄：<input type="text" name="bother"><br>
    从哪听说：<input type="text" name="hearfrom"><br>
    <input type="submit" name="注册" value="更新">
</form>
</body>
</html>
