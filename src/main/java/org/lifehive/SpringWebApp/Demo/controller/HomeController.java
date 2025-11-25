package org.lifehive.SpringWebApp.Demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody
    public String greet() {
        return "Hi to my website!!!!!!!";
    }

    @RequestMapping("/about")
    public String about() {
        return "This is my about page";
    }
}
