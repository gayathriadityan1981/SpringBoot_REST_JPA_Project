package com.example.demo.services;

import com.example.demo.entity.request.AddUserRequest;
import com.example.demo.repository.UserRepository;
import com.example.demo.entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    private UserRepository userRepository;

    @Autowired
    public UserServices(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public void addUser(AddUserRequest addUserRequest)
    {
        User user=new User();
        user.setFirstName(addUserRequest.getFirstName());
        user.setLastName(addUserRequest.getLastName());
        userRepository.save(user);

    }

    public List<User> findAll()
    {
        List<User> users=userRepository.findAll();
        return users;
    }
}
