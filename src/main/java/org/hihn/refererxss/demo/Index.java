package org.hihn.refererxss.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
public class Index {

    @GetMapping("/")
    public String index(HttpServletRequest request) {
        return "index";
    }

    @GetMapping("/index2")
    public ModelAndView index2(HttpServletRequest request) {
        String referrer = request.getHeader("referer");

        ModelAndView modelAndView = new ModelAndView("index2");
        modelAndView.addObject("referrer", referrer);
        return modelAndView;
    }

}
