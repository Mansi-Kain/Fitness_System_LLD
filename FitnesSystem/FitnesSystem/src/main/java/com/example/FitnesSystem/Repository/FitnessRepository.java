package com.example.FitnesSystem.Repository;

import com.example.FitnesSystem.Entity.FitnessClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface FitnessRepository extends JpaRepository<FitnessClass,Long> {
    List<FitnessClass> findByStartTimeAfter(LocalDateTime dateTime);
}
