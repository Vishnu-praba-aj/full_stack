package com.example.model;

import jakarta.validation.constraints.*;

public class AdvancedValidationCar {

    @NotNull
    private String vin;

    @NotBlank
    private String ownerName;

    @Pattern(regexp = "[A-Z]{2}[0-9]{2} [A-Z]{3}")
    private String licensePlate;

    @Min(1886)
    @Max(2100)
    private int year;

    // Getters and setters
    public String getVin() { return vin; }
    public void setVin(String vin) { this.vin = vin; }

    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public String getLicensePlate() { return licensePlate; }
    public void setLicensePlate(String licensePlate) { this.licensePlate = licensePlate; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
}
