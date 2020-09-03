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
    <script src="js/jquery-3.4.1.js" charset="UTF-8"></script>
    <script src="js/bootstrap.js" charset="UTF-8"></script>
    <link href="css/bootstrap.css" rel="stylesheet">
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
                        <a href="#">删除</a>
                        <a href="#">编辑</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
        <tfoot>
            <tr>
               <td colspan="4">
                   <center>
                       <nav aria-label="Page navigation example">
                           <ul class="pagination">
                               <c:if test="${pageInfo.pageNum > 1}">
                               <li
                                       class="page-item"><a class="page-link" href="paginationQuery?currentPage=${pageInfo.pageNum-1}">
                                   Previous</a></li>
                               </c:if>

                               <c:forEach begin="1" end="${pageInfo.pages}" varStatus="st">
                               <li class="page-item"><a class="page-link"
                                                        href="paginationQuery?currentPage=${st.index}">${st.index}</a></li>
                               </c:forEach>

                               <c:if test="${pageInfo.pageNum < pageInfo.pages}">
                               <li
                                       class="page-item"><a class="page-link"
                                                            href="paginationQuery?currentPage=${pageInfo.pageNum+1}">Next
                               </a></li>
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
