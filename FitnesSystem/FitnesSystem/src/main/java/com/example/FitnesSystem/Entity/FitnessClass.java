package com.example.FitnesSystem.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FitnessClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String className;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int maxCapacity;

    @OneToMany(mappedBy = "fitnessClass" ,cascade=CascadeType.ALL)
    List<Booking> bookings;

}
