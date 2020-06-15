package com.example.mappings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller("myController")
public class SampleController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("::::::::::::::::::::::::::::::::Controller:::::::::::::::::::::::::::::::::");
        response.getWriter().print("Hello world!");
        return null;
    }
}
