import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-car-form',
  templateUrl: './car-form.component.html'
})
export class CarComponent implements OnInit {
  carForm!: FormGroup;

  constructor(private fb: FormBuilder) {}

  ngOnInit(): void {
    this.carForm = this.fb.group({
      vin: ['', Validators.required],
      ownerName: ['', [Validators.required, Validators.minLength(2)]],
      licensePlate: ['', [Validators.required, Validators.pattern('[A-Z]{2}[0-9]{2} [A-Z]{3}')]],
      year: [null, [Validators.min(1886), Validators.max(2100)]]
    });
  }

  onSubmit(): void {
    if (this.carForm.valid) {
      console.log('Form Submitted', this.carForm.value);
    } else {
      console.log('Form Invalid');
    }
  }
}