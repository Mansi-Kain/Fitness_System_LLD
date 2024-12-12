package com.example.FitnesSystem.Controller;

import com.example.FitnesSystem.Entity.Booking;
import com.example.FitnesSystem.Service.BookingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/book")
    public Booking bookClass(@RequestParam Long userId, @RequestParam Long classId) {
        return bookingService.bookClass(userId, classId);
    }
}
