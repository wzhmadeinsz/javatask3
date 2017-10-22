<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: home
  Date: 2017/10/13
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ads</title>
</head>
<body>
    <form action="${ctx}/user/${perdis.id}" method="post" accept-charset="UTF-8" onsubmit="document.charset='UTF8';">
        名字：<input type="text" name="name" value="${perdis.name}" readonly="readonly"><br>
        ID:<input type="text" name="id" value="${perdis.id}" readonly="readonly"><br>
        QQ：<input type="text" name="qq" value="${perdis.qq}"><br>
        报到日期：<input type="text" name="date" value="${perdis.date}"><br>
        毕业于：<input type="text" name="graduate" value="${perdis.graduate}"><br>
        愿望：<input type="text" name="wish" value="${perdis.wish}"><br>
        师兄：<input type="text" name="bother" value="${perdis.bother}"><br>
        从哪听说：<input type="text" name="hearfrom" value="${perdis.hearfrom}"><br>
        <input type="submit" name="更新提交" value="更新">
    </form>
    <form action="${ctx}/user/${perdis.id}" method="get">
        <input type="submit" name="删除提交" value="删除"><input type="number" name="id" readonly="readonly" value="${perdis.id}">
    </form>
</body>
</html>
