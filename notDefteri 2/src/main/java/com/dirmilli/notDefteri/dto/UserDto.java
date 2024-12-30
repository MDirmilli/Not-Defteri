package com.dirmilli.notDefteri.dto;


import com.dirmilli.notDefteri.entities.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {

    private String username;

    private String password;

    public UserDto(User user) {
        this.username = user.getUsername();
        this.password = user.getPassword();

    }
}
