package com.example.vehicle.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

public class VehicleInspection {

    @Valid
    @NotNull
    private Vehicle vehicle;

    @NotNull(message = "Inspector name is required")
    @Size(min = 3, max = 50, message = "Inspector name must be between 3 and 50 characters")
    private String inspectorName;

    @NotNull(message = "Inspection date is required")
    @PastOrPresent(message = "Inspection date must be in the past or today")
    private LocalDate inspectionDate;

    @AssertTrue(message = "Inspection required for vehicles older than 10 years")
    public boolean isInspectionValid() {
        if (vehicle == null || inspectionDate == null) {
            return true; // Skip check until values are populated
        }
        int currentYear = LocalDate.now().getYear();
        return currentYear - vehicle.getYear() <= 10 || inspectionDate != null;
    }

    // Getters and Setters

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getInspectorName() {
        return inspectorName;
    }

    public void setInspectorName(String inspectorName) {
        this.inspectorName = inspectorName;
    }

    public LocalDate getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(LocalDate inspectionDate) {
        this.inspectionDate = inspectionDate;
    }
}
