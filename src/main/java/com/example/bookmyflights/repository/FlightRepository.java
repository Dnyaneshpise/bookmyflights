package com.example.bookmyflights.repository;

import com.example.bookmyflights.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {}
