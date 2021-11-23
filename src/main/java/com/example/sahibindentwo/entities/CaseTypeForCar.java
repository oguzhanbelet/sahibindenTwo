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
@Table(name = "case_types_for_cars")
public class CaseTypeForCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "case_type_for_car_id")
    private int caseTypeForCarId;

    @Column(name = "case_type_for_car_name")
    private String caseTypeForCarName;

    @OneToMany(mappedBy = "caseTypeForCar")
    private List<Car> cars;

    @OneToMany(mappedBy = "caseTypeForCar")
    private List<RentalCar> rentalCars;
}
