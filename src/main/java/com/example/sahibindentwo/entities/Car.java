package com.example.sahibindentwo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cars")
public class Car extends Vehicle {

    private boolean swap;

    @ManyToOne()
    @JoinColumn(name = "traction_type_id")
    private TractionType tractionType;

    @ManyToOne()
    @JoinColumn(name = "case_type_for_car_id")
    private CaseTypeForCar caseTypeForCar;
}
