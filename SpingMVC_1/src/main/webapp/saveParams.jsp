<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: 13556
  Date: 2020/9/1
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Save</title>
</head>
<body>
    <center><h3><p>request传值</p></h3></center>
    request传值   :   ${requestScope.req1}<br>
    request传值   :   ${requestScope.req2}<br>
    <br>
    session传值   :   ${sessionScope.req1}<br>
    session传值   :   ${sessionScope.req1}<br>
    <hr >
    <center><h3><p>session传值</p></h3></center>
    request传值   :   ${requestScope.ses1}<br>
    request传值   :   ${requestScope.ses2}<br>
    <br>
    session传值   :   ${sessionScope.ses1}<br>
    session传值   :   ${sessionScope.ses2}<br>
    <hr >
    <center><h3><p>model传值 作用域Request</p></h3></center>
    request传值   :   ${requestScope.m1}<br>
    request传值   :   ${requestScope.m2}<br>
    <br>
    session传值   :   ${sessionScope.m1}<br>
    session传值   :   ${sessionScope.m2}<br>
    <hr >
    <center><h3><p>ModelAndView传值 作用域Request</p></h3></center>
    request传值   :   ${requestScope.mav1}<br>
    request传值   :   ${requestScope.mav2}<br>
    <br>
    session传值   :   ${sessionScope.mav1}<br>
    session传值   :   ${sessionScope.mav2}<br>
    <hr >
    <center><h3><p>ModelAndView传值 + SessionAttributes注解 作用域Request 增加到session</p></h3></center>
    request传值   :   ${requestScope.ms1}<br>
    request传值   :   ${requestScope.ms2}<br>
    request传值   :   ${requestScope.user.id} , ${requestScope.user.name} , ${requestScope.user.gender} , <fmt:formatDate value="${requestScope.user.birth}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate> <br>
    <br>
    session传值   :   ${sessionScope.ms1}<br>
    session传值   :   ${sessionScope.ms2}<br>
    session传值   :   ${sessionScope.user.id} , ${sessionScope.user.name} , ${sessionScope.user.gender} , <fmt:formatDate value="${sessionScope.user.birth}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate><br>
</body>
</html>
