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
@Table(name = "numberOfCylinders")
public class NumberOfCylinder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "number_of_cylinder_id")
    private int numberOfCylinderId;

    @Column(name = "number_of_cylinder_name")
    private String numberOfCylinderName;

    @OneToMany(mappedBy = "numberOfCylinder")
    private List<Motorcycle> motorcycles;
}
