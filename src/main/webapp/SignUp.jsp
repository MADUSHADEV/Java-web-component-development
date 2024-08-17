<%--
  Created by IntelliJ IDEA.
  User: REDTECH
  Date: 15/8/2024
  Time: 1:28 pm
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WCD</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div class="container">
    <div class="detail-section">
        <h1>Sign Up</h1>
        <form action="sign-up" method="POST">
            <label>Name</label>
            <input type="text" name="name" required/>
            <label>Mobile</label>
            <input type="text" name="mobile" required/>
            <label>Country</label>
            <select name="country">
                <option value="India">India</option>
                <option value="USA">USA</option>
                <option value="UK">UK</option>
            </select>
            <button type="submit">Create Account</button>
        </form>
    </div>
</div>
</body>
</html>
