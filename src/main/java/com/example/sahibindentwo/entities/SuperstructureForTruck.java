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
@Table(name = "superstructureForTrucks")
public class SuperstructureForTruck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "superstructure_for_truck_id")
    private int superStructureForTruckId;

    @Column(name = "superstructure_for_truck_name")
    private String superStructureForTruckName;

    @OneToMany(mappedBy = "superstructureForTruck")
    private List<Truck> trucks;
}
