package com.lexelpro.controller;

import com.lexelpro.entity.User;
import com.lexelpro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author Lexel PRO
 * @version 1.0
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public ModelAndView getAllUsers() {
        List<User> userList = userService.getAllUsers();
        return new ModelAndView("index", "userList", userList);
    }
}