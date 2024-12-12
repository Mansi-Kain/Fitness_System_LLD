package com.example.FitnesSystem.Repository;

import com.example.FitnesSystem.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
