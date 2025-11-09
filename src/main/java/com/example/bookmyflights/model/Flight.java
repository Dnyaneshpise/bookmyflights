package com.example.bookmyflights.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String airline;
    private String destination;

    public Flight() {}

    // public Flight(String airline, String destination) {
    //     this.airline = airline;
    //     this.destination = destination;
    // }

    // // Getters and setters
    // public Long getId() { return id; }
    // public String getAirline() { return airline; }
    // public String getDestination() { return destination; }
    // public void setAirline(String airline) { this.airline = airline; }
    // public void setDestination(String destination) { this.destination = destination; }
}
