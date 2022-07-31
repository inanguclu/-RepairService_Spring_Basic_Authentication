package com.example.springsecurityrepairservicerestapi.restcontrollers;

import com.example.springsecurityrepairservicerestapi.entities.User;
import com.example.springsecurityrepairservicerestapi.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserRestController {

    final UserService userService;
    public UserRestController(UserService uService) {
        this.userService = uService;
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody User user ){
        return userService.register(user);
    }

    @GetMapping("/list")
    public ResponseEntity list(){
        return userService.list();
    }


}
