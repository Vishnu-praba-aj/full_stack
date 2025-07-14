package com.example.vehicle.model;

import jakarta.validation.constraints.*;

public class Vehicle {

    @NotBlank(message = "VIN must not be blank")
    @Size(min = 17, max = 17, message = "VIN must be 17 characters")
    private String vin;

    @NotBlank(message = "Owner name is required")
    private String ownerName;

    @Pattern(regexp = "[A-Z]{2}[0-9]{2} [A-Z]{3}", message = "License plate format invalid")
    private String licensePlate;

    @Min(value = 1990, message = "Year must be after 1990")
    @Max(value = 2100, message = "Year must be reasonable")
    private int year;

    @DecimalMin(value = "1000.0", inclusive = true, message = "Price must be at least 1000")
    @DecimalMax(value = "1000000.0", inclusive = true, message = "Price must be below 1 million")
    private double price;

    // Getters and Setters
}
