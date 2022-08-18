package com.example.conference.controller;

import com.example.conference.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstName", defaultValue = "Rhys") String firstName,
                        @RequestParam(value = "lastName", defaultValue = "Ballinger") String lastName,
                        @RequestParam(value = "age", defaultValue = "24") int age) {
        User user = new User();

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);

        return user;
    }

}
