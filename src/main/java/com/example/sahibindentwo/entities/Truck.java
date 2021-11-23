package com.example.sahibindentwo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "trucks")
public class Truck extends Vehicle {

    private boolean swap;

    private int maxCarriageCapacity;
    @Size(max = 100)
    private int tyreCondition;

    @ManyToOne()
    @JoinColumn(name = "traction_type_id")
    private TractionType tractionType;

    @ManyToOne()
    @JoinColumn(name = "superstructure_for_truck_id")
    private SuperstructureForTruck superstructureForTruck;
}
