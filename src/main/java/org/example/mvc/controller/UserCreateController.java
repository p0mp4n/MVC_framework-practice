package org.example.mvc.controller;

import org.example.mvc.model.User;
import org.example.mvc.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserCreateController implements Controller {

    @Override
    public String handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
        UserRepository.save(new User(req.getParameter("userId"), req.getParameter("name")));
        return "redirect:/users";
    }
}
