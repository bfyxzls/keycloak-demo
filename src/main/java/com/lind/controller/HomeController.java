package com.lind.controller;

import com.lind.feign.DemoProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@RestController
public class HomeController {
    @Autowired
    DemoProductClient demoProductClient;

    @GetMapping(path = "/callback")
    public String callback(@RequestParam String code) {
        return String.format("code:%s", code);
    }

    @GetMapping(path = "/index")
    public String index() {
        return demoProductClient.index();
    }

    @GetMapping(path = "/users")
    public String getUserInfo() {
        return demoProductClient.getUserInfo();
    }

    @RequestMapping(value = "/logout", method = {RequestMethod.GET, RequestMethod.POST})
    public String logout(HttpServletRequest request) {
        try {
            request.logout();
            return "logout success";
        } catch (ServletException e) {
            return "logout fail";
        }
    }
}
