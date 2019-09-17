<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Study
  Date: 17.07.2019
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <table border="2" cellspacing="2">
        <tr>
            <th><a href="/userList/1/id">Id</a></th>
            <th><a href="/userList/1/username">Username</a></th>
            <th><a href="/userList/1/email">Email</a></th>
            <th><a href="/userList/1/password">Password</a></th>
            <th><a href="/userList/1/age">Age</a></th>
            <th><a href="/userList/1/phone">Phone</a></th>
        </tr>
        <c:forEach var="u" items="${userList}">
            <tr>
                <td>${u.id}</td>
                <td>${u.username}</td>
                <td>${u.email}</td>
                <td>${u.password}</td>
                <td>${u.age}</td>
                <td>${u.phone}</td>
            </tr>
        </c:forEach>
    </table>
    <div>
        <a href="/userList/1/id">1</a>
        <a href="/userList/2/id">2</a>
        <a href="/userList/3/id">3</a>
    </div>
</body>
</html>
