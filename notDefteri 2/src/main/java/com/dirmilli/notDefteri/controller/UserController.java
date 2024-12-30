package com.dirmilli.notDefteri.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dirmilli.notDefteri.dto.UserDto;
import com.dirmilli.notDefteri.service.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
         this.userService = userService;
    }
    @PostMapping("/save")
    public String saveUser(@RequestBody UserDto userDto) {
        userService.saveUser(userDto);
        return "User saved successfully";
    }
    

}
