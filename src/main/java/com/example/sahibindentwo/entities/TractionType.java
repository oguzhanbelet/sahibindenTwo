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
@Table(name = "traction_types")
public class TractionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "traction_type_id")
    private int tractionTypeId;

    @Column(name = "traction_type_name")
    private String tractionTypeName;

    @OneToMany(mappedBy = "tractionType")
    private List<Car> cars;

    @OneToMany(mappedBy = "tractionType")
    private List<Minibus> minibuses;

    @OneToMany(mappedBy = "tractionType")
    private List<Panelvan> panelvans;

    @OneToMany(mappedBy = "tractionType")
    private List<SuvPickUpOffRoad> suvPickUpOffRoads;

    @OneToMany(mappedBy = "tractionType")
    private List<Truck> trucks;

    @OneToMany(mappedBy = "tractionType")
    private List<RentalCar> rentalCars;
}
