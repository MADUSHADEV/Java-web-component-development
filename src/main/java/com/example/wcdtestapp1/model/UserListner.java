package com.example.wcdtestapp1.model;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

import java.util.ArrayList;

public class UserListner implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context Initialized");
        ArrayList<User> userArrayList = new ArrayList<User>();
        sce.getServletContext().setAttribute("userList", userArrayList);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context Destroyed");
    }

}
