package com.example.sahibindentwo.Entities.Concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "semiTrailerTrucks")
public class SemiTrailerTruck extends Vehicle {

    private boolean swap;

    @Size(max = 100)
    private int tyreCondition;
    @Size(max = 10)
    private int bedCapacity;
    private boolean trailer;
}
