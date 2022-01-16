package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.User;
import web.service.UserServiceImpl;

import java.util.List;

@Controller
public class UserController {

    private UserServiceImpl userServiceImpl;

    public UserController() {
    }

    @Autowired
    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping("/")
    public String testUser() {
        return "test";
    }

    @GetMapping("/new")
    public String newUser(ModelMap model) {
        model.addAttribute("users", new User());
        return "users/new";
    }

    @GetMapping
    public String create(@ModelAttribute("user") User user) {
        userServiceImpl.saveUser(user);
        return "redirect:/users";
    }
}