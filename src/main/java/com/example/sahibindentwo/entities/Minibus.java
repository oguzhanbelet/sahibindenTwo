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
@Table(name = "minibusses")
public class Minibus extends Vehicle {

    private boolean swap;

    @Size(max = 80)
    private int seatCount;

    @ManyToOne()
    @JoinColumn(name = "traction_type_id")
    private TractionType tractionType;

}
