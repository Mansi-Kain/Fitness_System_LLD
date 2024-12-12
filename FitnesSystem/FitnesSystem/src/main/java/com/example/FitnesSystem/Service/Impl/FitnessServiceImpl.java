package com.example.FitnesSystem.Service.Impl;

import com.example.FitnesSystem.Entity.FitnessClass;
import com.example.FitnesSystem.Repository.FitnessRepository;
import com.example.FitnesSystem.Service.FitnessClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class FitnessServiceImpl implements FitnessClassService {

    private FitnessRepository fitnessRepository;

    @Autowired
    public FitnessServiceImpl(FitnessRepository fitnessRepository) {
        this.fitnessRepository = fitnessRepository;
    }

    @Override
    public List<FitnessClass> getAvailableClasses(LocalDateTime after) {
        return fitnessRepository.findByStartTimeAfter(after);
    }

    @Override
    public FitnessClass createFitnessClass(String name, LocalDateTime start, LocalDateTime end, int maxCapacity) {
        FitnessClass fitnessClass = new FitnessClass();
        fitnessClass.setClassName(name);
        fitnessClass.setStartTime(start);
        fitnessClass.setEndTime(end);
        fitnessClass.setMaxCapacity(maxCapacity);

        return fitnessRepository.save(fitnessClass);
    }
}
