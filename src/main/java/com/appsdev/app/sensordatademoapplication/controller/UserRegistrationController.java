package com.appsdev.app.sensordatademoapplication.controller;

import com.appsdev.app.sensordatademoapplication.DTO.UserDetailsDTO;
import com.appsdev.app.sensordatademoapplication.model.request.UserRequest;
import com.appsdev.app.sensordatademoapplication.model.response.UserRegistrationDetails;
import com.appsdev.app.sensordatademoapplication.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserRegistrationController {

    @Autowired

    UserService userService;

    @GetMapping
    public String getUser() {
        return "Welcome To Mobile App Circle!!!!";
    }

    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public  UserRegistrationDetails registerUser(@RequestBody UserRequest userRequest
    ) {
        final String METHOD_NAME="registerUser";


        System.out.println("------------------Start User Registration  Service--------------------");


       UserDetailsDTO userDetailsDTO = new UserDetailsDTO();


        BeanUtils.copyProperties(userRequest, userDetailsDTO);
        System.out.println("user ID:"+userDetailsDTO.getUserRegId());
        System.out.println("user Phone:"+userDetailsDTO.getUserPhone());
        System.out.println("userDetailsDTO.getUserName():"+userDetailsDTO.getUserName());

        userDetailsDTO = userService.registerUsers(userDetailsDTO);
        System.out.println("userDetailsDTO.getUserRegId():"+userDetailsDTO.getUserRegId());
        System.out.println("userDetailsDTO.getUserPhone():"+userDetailsDTO.getUserPhone());
        System.out.println("userDetailsDTO.getUserName():"+userDetailsDTO.getUserName());
        UserRegistrationDetails registrationDetails = new UserRegistrationDetails();
        BeanUtils.copyProperties(userDetailsDTO, registrationDetails);

        return registrationDetails;


    }
}
