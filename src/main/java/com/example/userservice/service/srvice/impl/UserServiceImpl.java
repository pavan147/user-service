package com.example.userservice.service.srvice.impl;

import com.example.userservice.commonutil.CommonUtility;
import com.example.userservice.dto.UserDto;
import com.example.userservice.entity.UserEntity;
import com.example.userservice.repo.UserRepo;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserDto createUser(UserDto userDto) {
        UserEntity userEntity = CommonUtility.mapUserDtoToUserEntity(userDto);
        userEntity.setEncryptedPassword(userDto.getPassword());
        UserEntity userEntityCreated = userRepo.save(userEntity);

        return CommonUtility.mapUserEntityToUserDto(userEntityCreated);
    }
}
