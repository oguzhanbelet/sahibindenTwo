package com.example.sahibindentwo.Entities.Concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "fuel_types")
public class Fuel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fuel_id")
    private int fuelId;

    @Column(name = "fuel_name")
    private String fuelName;

    @OneToMany(mappedBy = "fuel")
    private List<Vehicle> vehicles;
}
