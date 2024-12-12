package com.example.FitnesSystem.Service;

import com.example.FitnesSystem.Entity.FitnessClass;

import java.time.LocalDateTime;
import java.util.List;

public interface FitnessClassService {
    List getAvailableClasses(LocalDateTime after);
    FitnessClass createFitnessClass(String name ,LocalDateTime start ,LocalDateTime end,int maxCapacity);
}
