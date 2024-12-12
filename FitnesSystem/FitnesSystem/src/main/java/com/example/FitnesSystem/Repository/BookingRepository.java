package com.example.FitnesSystem.Repository;

import com.example.FitnesSystem.Entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long> {
}
