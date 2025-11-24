package org.lifehive.SpringWebApp.Demo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LoginController {

    @RequestMapping("/login")
    fun loginPage() : String {
        return "This is my first Login Page";
    }
}