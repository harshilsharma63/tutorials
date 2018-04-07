package com.baeldung.performancetesting.controller;


import com.baeldung.performancetesting.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static io.github.benas.randombeans.api.EnhancedRandom.random;

@RestController
public class UserController {

    @GetMapping("/get-random-user")
    @ResponseBody
    public User getUser() {
        return random(User.class);
    }
}
