package com.example.sahibindentwo.Entities.Concretes;

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
@Table(name = "coolingTypeForMotorcycles")
public class CoolingTypeForMotorcycle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cooling_type_for_motorcycle_id")
    private int coolingTypeForMotorcycleId;

    @Column(name = "cooling_type_for_motorcycle_name")
    private String coolingTypeForMotorcycleName;

    @OneToMany(mappedBy = "coolingTypeForMotorcycle")
    private List<Motorcycle> motorcycles;
}
