package com.howell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class TestController {
    @RequestMapping("/test")
    public void test(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect("/test.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
