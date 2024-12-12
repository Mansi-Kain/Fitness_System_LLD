package com.example.FitnesSystem.Service;

import com.example.FitnesSystem.Entity.User;

public interface UserService {
    User getUserById(Long id);
    User registerUser(String name);
}
