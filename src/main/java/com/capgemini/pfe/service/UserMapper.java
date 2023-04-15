package com.capgemini.pfe.service;

import com.capgemini.pfe.dto.UserDto;
import com.capgemini.pfe.webClientApi.UserApi;

import java.util.List;
import java.util.Objects;

public class UserMapper {

    public static UserDto mapApiToDto(UserApi usrApi) {
        UserDto userDto = new UserDto();
        userDto.setId(usrApi.getId());
        userDto.setAge(99);
        if (!Objects.nonNull(usrApi.getName()) && usrApi.getName().split("\\s+").length > 1) {
            String firstName = usrApi.getName().split("\\s+")[0];
            String lastName = usrApi.getName().split("\\s+")[1];
            userDto.setFirstName(firstName);
            userDto.setLastName(lastName);
        } else {
            userDto.setFirstName(usrApi.getUsername());
            userDto.setLastName(usrApi.getName());
        }
        return userDto;
    }
}
