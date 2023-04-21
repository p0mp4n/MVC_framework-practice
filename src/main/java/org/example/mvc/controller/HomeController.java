package org.example.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController implements Controller{
    @Override
    public String handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
        return "home.jsp";
    }
}
