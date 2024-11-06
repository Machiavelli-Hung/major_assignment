package com.example.demo.service.impl;

import com.example.demo.service.UserService;
import com.example.demo.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
   private  UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDto> findAllUsers(){
        List<User> users=userRepository.findAll();
        return users.stream().map((user) ->mapToUserDto(user).collect(Collectors.toList()));


    }
    private UserDto mapToUserDto(User user){

        UserDto userDto = UserDto.builder()
                .id(User.getId())
                
                .build();
    }
}
