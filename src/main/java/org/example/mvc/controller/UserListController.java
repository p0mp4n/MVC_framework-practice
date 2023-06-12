package org.example.mvc.controller;

import org.example.mvc.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class UserListController implements Controller{
    @Override
    public String handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
        req.setAttribute("users", UserRepository.findAll());
        return "/user/list";
    }
}
