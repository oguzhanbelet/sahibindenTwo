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
@Table(name = "gear_types")
public class Gear {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gear_id")
    private int gearId;

    @Column(name = "gear_name")
    private String gearName;

    @OneToMany(mappedBy = "gear")
    private List<Vehicle> vehicles;
}
