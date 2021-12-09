package com.example.sahibindentwo.Entities.Concretes;

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
@Table(name = "motorcycles")
public class Motorcycle extends Vehicle {

    private boolean swap;

    @ManyToOne()
    @JoinColumn(name = "cooling_type_for_motorcycle_id")
    private CoolingTypeForMotorcycle coolingTypeForMotorcycle;

    @ManyToOne()
    @JoinColumn(name = "number_of_cylinder_id")
    private NumberOfCylinder numberOfCylinder;

    @ManyToOne()
    @JoinColumn(name = "timing_type_id")
    private TimingType timingType;
}
