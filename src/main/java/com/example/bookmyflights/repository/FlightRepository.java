package com.example.bookmyflights.repository;

import com.example.bookmyflights.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {}
