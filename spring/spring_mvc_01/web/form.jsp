<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/8/23
  Time: 0:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick11" method="post">
    <input type="text" name="userList[0].username"><br>
    <input type="text" name="userList[0].age"><br>
    <input type="text" name="userList[1].username"><br>
    <input type="text" name="userList[1].age"><br>
    <input type="submit" value="提交"><br>
</form>
</body>
</html>
