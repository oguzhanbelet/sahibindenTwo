package com.example.sahibindentwo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "paymentMethodsForRentalCars")
public class PaymentMethodForRentalCar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_method_for_rental_car_id")
    private int paymentMethodForRentalCarId;

    @Column(name = "payment_method_for_rental_car_name")
    private String paymentMethodForRentalCarName;

    @OneToMany(mappedBy = "paymentMethodForRentalCar")
    private List<RentalCar> rentalCars;
}
