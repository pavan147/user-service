package com.example.userservice.service;

import com.example.userservice.dto.UserDto;
import org.springframework.stereotype.Repository;


public interface UserService {

    public UserDto createUser(UserDto userDto);
}
