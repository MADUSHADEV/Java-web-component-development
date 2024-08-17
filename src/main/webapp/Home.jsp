<%@ page import="com.example.wcdtestapp1.model.User" %><%--
  Created by IntelliJ IDEA.
  User: REDTECH
  Date: 17/8/2024
  Time: 2:02 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div class="container">
    <h1>Welcome to the Home Page</h1>
    <%
        if (session.getAttribute("user") != null) {
            User user = (User) session.getAttribute("user");
    %>
    <div class="home-card">
        <h2 class="home-name">Welcome, <%= user.getName() %>
        </h2>
        <h2 class="home-mobile"><%= user.getMobile() %>
        </h2>
        <h2 class="home-country"><%= user.getCountry()%>
        </h2>
    </div>
    <%
        } else {
            response.sendRedirect("Login.jsp");
        }
    %>
</div>
</body>
</html>
