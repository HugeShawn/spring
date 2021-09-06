<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script>
        var userList = new Array();
        userList.push({username: "zhangsan", age: "20"});
        userList.push({username: "lisi", age: "20"});
        $.ajax({
            type: "POST",
            url: "${pageContext.request.contextPath}/user/quick12",
            data: JSON.stringify(userList),
            contentType: 'application/json;charset=utf-8'
        });
    </script>
</head>
<body>

</body>
</html>
