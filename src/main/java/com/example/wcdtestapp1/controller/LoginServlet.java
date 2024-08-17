package com.example.wcdtestapp1.controller;

import com.example.wcdtestapp1.model.User;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mobile = req.getParameter("mobile");
        ServletContext serCon = req.getServletContext();
        ArrayList<User> userList = (ArrayList<User>) serCon.getAttribute("userList");

        boolean userFound = false;
        for (User user : userList) {
            if (user.getMobile().equals(mobile)) {
                userFound = true;
                resp.sendRedirect("Home.jsp");
                HttpSession session = req.getSession();
                session.setAttribute("user", user);
                break;
            }
        }
        if (!userFound) {
            resp.sendRedirect("Login.jsp?error=Invalid User");
        }
    }
}
