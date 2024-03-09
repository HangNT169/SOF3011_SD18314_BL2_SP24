<%--
  Created by IntelliJ IDEA.
  User: hangnt
  Date: 07/03/2024
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${a}
<form action="/ket-qua" method="post">
    <div class="container">
        <label for="uname"><b>Username</b></label>
        <input type="text" placeholder="Enter Username" name="a" >

        <label for="psw"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="b" >

        <button type="submit">Login</button>
    </div>

</form>
</body>
</html>
