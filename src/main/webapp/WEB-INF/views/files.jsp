<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Files</title>
</head>
<body>
  <div c:if="${message}">
    <h2>${message}</h2>
  </div>
  <div>
    <form method="post" action="/upload" enctype="multipart/form-data">
      <label for="file">File: </label>
      <input type="file" id="file" name="file">
      <input type="submit" value="Upload">
    </form>
  </div>
  <div>
    <ul>
      <c:forEach items="${files}" var="file">
        <li><a href="${file}">${file}</a></li>
        <img src="${file}" width="100px" height="100px">
        <a href="/delete"
      </c:forEach>
    </ul>
  </div>
</body>
</html>
