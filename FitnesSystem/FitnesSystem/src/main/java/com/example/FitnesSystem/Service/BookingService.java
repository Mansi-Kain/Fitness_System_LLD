package com.example.FitnesSystem.Service;

import com.example.FitnesSystem.Entity.Booking;

public interface BookingService {
    Booking bookClass(Long UserId,Long classId);
}
