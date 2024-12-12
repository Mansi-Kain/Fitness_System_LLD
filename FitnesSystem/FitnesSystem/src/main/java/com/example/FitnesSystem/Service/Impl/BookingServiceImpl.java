package com.example.FitnesSystem.Service.Impl;

import com.example.FitnesSystem.Entity.Booking;
import com.example.FitnesSystem.Entity.FitnessClass;
import com.example.FitnesSystem.Entity.User;
import com.example.FitnesSystem.Repository.BookingRepository;
import com.example.FitnesSystem.Repository.FitnessRepository;
import com.example.FitnesSystem.Repository.UserRepository;
import com.example.FitnesSystem.Service.BookingService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class BookingServiceImpl implements BookingService {
    private BookingRepository bookingRepository;
    private UserRepository userRepository;
    private FitnessRepository fitnessRepository;

//    @Autowired
//    public BookingServiceImpl(BookingRepository bookingRepository,UserRepository userRepository,FitnessRepository fitnessRepository){
//        this.bookingRepository=bookingRepository;
//        this.userRepository=userRepository;
//        this.fitnessRepository=fitnessRepository;
//    }
    @Override
    public Booking bookClass(Long userId, Long classId) {
        User user=userRepository.findById(userId).orElseThrow();
        FitnessClass fitnessClass = (FitnessClass) fitnessRepository.findById(classId).orElseThrow();
        Booking booking = new Booking();
        booking.setUser(user);
        booking.setFitnessClass(fitnessClass);
        booking.setBookingTime(LocalDateTime.now());
        return bookingRepository.save(booking);
    }
}
