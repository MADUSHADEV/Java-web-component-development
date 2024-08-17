<%--
  Created by IntelliJ IDEA.
  User: REDTECH
  Date: 17/8/2024
  Time: 1:32 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div class="container">
    <% if (request.getParameter("error") != null) { %>
    <h3 class="error"><%= request.getParameter("error") %></h3>
    <% } %>
    <form action="login" method="POST">
        <label class="login-label">Mobile Number</label>
        <input type="tel" name="mobile" class="login-input" required/>
        <button type="submit" class="login-btn">Login</button>
    </form>
</div>
</body>
</html>
