<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: GZH
  Date: 2021/11/24
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>
</head>
<body>
    <table>
        <tr>
            <th>编号</th>
            <th>名称</th>
            <th>数量</th>
            <th>详情</th>
        </tr>
        <c:forEach var="book" items="${list}">
            <tr>
                <td>${book.bookId}</td>
                <td>${book.bookName}</td>
                <td>${book.bookCounts}</td>
                <td>${book.detail}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
