package com.example.userservice.controller;

import com.example.userservice.dto.UserDto;
import com.example.userservice.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/status-check")
    public String statusCheck() {
        logger.info("This is Status check");
        return "Working";
    }

    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        UserDto userCreatedUserDto = userService.createUser(userDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(userCreatedUserDto);
    }

}

