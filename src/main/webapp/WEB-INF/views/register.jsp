<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <title>Register</title>
</head>
<body>
<form:form action="/saveUser" modelAttribute="user">
    <div>
        <form:label path="username">Username: </form:label>
        <form:input path="username"/>
    </div>
    <div>
        <form:label path="email">Email: </form:label>
        <form:input path="email"/>
        <form:errors path="email" cssClass="error"/>
    </div>
    <div>
        <form:label path="password">Password: </form:label>
        <form:password path="password"/>
    </div>
    <div>
        <form:label path="age">Age: </form:label>
        <form:input path="age"/>
    </div>
    <div>
        <form:label path="phone">Phone: </form:label>
        <form:input path="phone"/>
    </div>
    <div>
        <input type="submit" value="Register">
    </div>
</form:form>
</body>
</html>
