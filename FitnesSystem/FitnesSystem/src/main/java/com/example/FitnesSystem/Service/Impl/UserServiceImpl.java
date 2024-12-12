package com.example.FitnesSystem.Service.Impl;

import com.example.FitnesSystem.Entity.User;
import com.example.FitnesSystem.Repository.UserRepository;
import com.example.FitnesSystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public User getUserById(Long id) {
        User user=userRepository.findById(id).orElseThrow();
        return user;

    }

    @Override
    public User registerUser(String name) {
        User user=new User();
        user.setName(name);
        return userRepository.save(user);
    }
}
