package com.example.userservice.commonutil;

import com.example.userservice.dto.UserDto;
import com.example.userservice.entity.UserEntity;

public class CommonUtility {

    public static UserEntity mapUserDtoToUserEntity(UserDto userDto) {

        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(userDto.getFirstName());
        userEntity.setLastName(userDto.getLastName());
        userEntity.setEmail(userDto.getEmail());
        return userEntity;
    }

    public static UserDto mapUserEntityToUserDto(UserEntity userEntity) {
        UserDto userDto = new UserDto();
        userDto.setFirstName(userEntity.getFirstName());
        userDto.setLastName(userEntity.getLastName());
        userDto.setEmail(userEntity.getEmail());
        userDto.setUserId(userEntity.getUserId());
        return userDto;
    }
}