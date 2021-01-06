package com.dbms.boot.controller;

import com.dbms.boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;
import com.dbms.boot.domain.Users;

@Controller
public class LoginController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/entry")
    public String entry(Model model) {
        return "entryPage";
    }

    @GetMapping("/login")
    public String login(Model model) {
        Users user = new Users();
        model.addAttribute("user", user);
        return "loginPage";
    }

    @GetMapping("/register")
    public String register(Model model) {
        Users newUser = new Users();
        model.addAttribute("newUser", newUser);
        return "registerPage";
    }
}
