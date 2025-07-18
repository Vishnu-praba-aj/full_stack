import { Component } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-vehicle-form',
  templateUrl: './vehicle-form.component.html'
})
export class VehicleFormComponent {
  vehicleForm = this.fb.group({
    vin: ['', [Validators.required, Validators.minLength(17), Validators.maxLength(17)]],
    ownerName: ['', Validators.required],
    licensePlate: ['', [Validators.pattern(/^[A-Z]{2}[0-9]{2} [A-Z]{3}$/)]],
    year: [null, [Validators.min(1990), Validators.max(2100)]],
    price: [null, [Validators.min(1000), Validators.max(1000000)]]
  });

  constructor(private fb: FormBuilder) {}

  onSubmit() {
    if (this.vehicleForm.valid) {
      console.log('Form Submitted:', this.vehicleForm.value);
    }
  }
}
