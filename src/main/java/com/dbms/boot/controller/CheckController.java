package com.dbms.boot.controller;

import com.dbms.boot.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;
import com.dbms.boot.domain.Users;

@Controller
public class CheckController {
    @Autowired
    private UsersService usersService;

    @GetMapping("/checklogin")
    public String checkLogin(HttpServletRequest request) {
        String username = request.getParameter("USERNAME");
        String password = request.getParameter("PASSWORD");
        boolean rtn = usersService.login(username, password);
        if (rtn) return "homepage";
        else return "loginFail";
    }

    @GetMapping("/checkregister")
    public String checkRegister(HttpServletRequest request) {
        String username = request.getParameter("USERNAME");
        String password = request.getParameter("PASSWORD");
        if (username.equals("") || password.equals("")) return "registerFail";
        boolean rtn = usersService.register(username, password);
        if (rtn) return "entryPage";
        else return "registerFail";
    }
}
