package com.example.springsecurityrepairservicerestapi.restcontrollers;

import com.example.springsecurityrepairservicerestapi.entities.User;
import com.example.springsecurityrepairservicerestapi.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRestController {

    final UserService uService;
    public UserRestController(UserService uService) {
        this.uService = uService;
    }

    @PostMapping("/register")
    private ResponseEntity register(@RequestBody User user ){
        return uService.register(user);
    }


}
