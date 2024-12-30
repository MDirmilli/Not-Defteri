package com.dirmilli.notDefteri.service;


import org.springframework.stereotype.Service;

import com.dirmilli.notDefteri.dto.UserDto;
import com.dirmilli.notDefteri.entities.User;
import com.dirmilli.notDefteri.repository.UserRepository;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public UserDto saveUser(UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());

        return new UserDto(userRepository.save(user));

    }


}
