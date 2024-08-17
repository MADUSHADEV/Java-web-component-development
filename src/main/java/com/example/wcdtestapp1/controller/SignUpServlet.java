package com.example.wcdtestapp1.controller;

import com.example.wcdtestapp1.model.User;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "SignUpServlet", value = "/sign-up")
public class SignUpServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = request.getParameter("name");
        String mobile = request.getParameter("mobile");
        String country = request.getParameter("country");

        User user = new User(name, mobile, country);
        ServletContext serCon = request.getServletContext();

        ArrayList<User> userArray = (ArrayList<User>) serCon.getAttribute("userList");
        userArray.add(user);

        response.sendRedirect("Login.jsp");

    }
}
