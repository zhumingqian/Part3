<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Author: ZhuMingQ
  Date: 2020/9/3
  Time: 8:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>信息</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.4.1.js" charset="UTF-8"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.js" charset="UTF-8"></script>
    <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet">
</head>
<body>
    <table class="table">
        <thead class="thead-dark">
            <tr>
                <td scope="col">编号</td>
                <td scope="col">姓名</td>
                <td scope="col">年龄</td>
                <td scope="col">操作</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${pageInfo.list}" var="u" varStatus="index" >
                <tr>
                    <td>${index.index + 1}</td>
                    <td>${u.name}</td>
                    <td>${u.age}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/page/toUpdateInfo/${u.id}">编辑</a>
                        <a href="${pageContext.request.contextPath}/page/deleteInfo/${u.id}">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
        <tfoot>
            <tr>
                <td colspan="4">
                    <a href="${pageContext.request.contextPath}/addInfo.jsp">添加信息</a>
                </td>
            </tr>
            <tr>
               <td colspan="4">
                   <center>
                       <nav aria-label="Page navigation example">
                           <ul class="pagination">
                               <c:if test="${pageInfo.pageNum == 1}">
                                   <li class="page-item disabled">
                                       <a class="page-link" href="javaScript:void(0)">
                                           Previous
                                       </a>
                                   </li>
                               </c:if>
                               <c:if test="${pageInfo.pageNum > 1}">
                               <li class="page-item">
                                   <a class="page-link" href="${pageContext.request.contextPath}/page/paginationQuery/${pageInfo.pageNum-1}">
                                       Previous
                                   </a>
                               </li>
                               </c:if>

                               <c:forEach begin="1" end="${pageInfo.pages}" varStatus="st">
                                <c:if test="${pageInfo.pageNum == st.index}">
                                    <li class="page-item  active">
                                        <a class="page-link" href="${pageContext.request.contextPath}/page/paginationQuery/${st.index}">
                                                ${st.index}
                                        </a>
                                    </li>
                                </c:if>
                               <c:if test="${pageInfo.pageNum != st.index}">
                                   <li class="page-item">
                                       <a class="page-link" href="${pageContext.request.contextPath}/page/paginationQuery/${st.index}">
                                               ${st.index}
                                       </a>
                                   </li>
                               </c:if>
                               </c:forEach>

                               <c:if test="${pageInfo.pageNum < pageInfo.pages}">
                               <li class="page-item">
                                   <a class="page-link" href="${pageContext.request.contextPath}/page/paginationQuery/${pageInfo.pageNum+1}">
                                       Next
                                   </a>
                               </li>
                               </c:if>
                               <c:if test="${pageInfo.pageNum == pageInfo.pages}">
                                   <li class="page-item disabled">
                                       <a class="page-link" href="javaScript:void(0)">
                                            Next
                                       </a>
                                   </li>
                               </c:if>
                           </ul>
                       </nav>
                   </center>
               </td>
            </tr>
        </tfoot>
    </table>
</body>
</html>
