package com.example.demo.controller;

import com.example.demo.entity.request.AddUserRequest;
import com.example.demo.services.UserServices;
import com.example.demo.entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user/")
public class UserController {
    @Autowired
    UserServices userServices;

    @RequestMapping(method = RequestMethod.POST)
    public void addUser(@RequestBody AddUserRequest addUserRequest)
    {
        addUser(addUserRequest);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAll()
    {
        return userServices.findAll();
    }

}
