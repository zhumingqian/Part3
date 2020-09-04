<%--
  Author: ZhuMingQ
  Date: 2020/9/3
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>添加信息</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/page/updateInfo" method="post">
        <input type="hidden" name="id" value="${user.id}">
        姓名:<input type="text" name="name" value="${user.name}">
        年龄:<input type="text" name="age" value="${user.age}">
        <input type="submit" value="添加信息">
    </form>
</body>
</html>
