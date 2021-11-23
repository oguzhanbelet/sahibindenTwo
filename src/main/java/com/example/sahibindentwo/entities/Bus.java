package com.example.sahibindentwo.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "busses")
public class Bus extends Vehicle {

    private boolean swap;

    private int passengerCapacity;
    private boolean singleSeat;
    private int screenSizeBehindSeat;
    @Size(max=21)
    private int numberOfGears;
    private int fuelCapacity;
    @Size(max = 100)
    private int tyreCondition;

}
