package com.example.sahibindentwo.Entities.Concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "suvPickUpOffRoads")
public class SuvPickUpOffRoad extends Vehicle {

    private boolean swap;

    @Column(name = "door")
    @Size(min = 2, max = 10)
    private int door;

    @ManyToOne()
    @JoinColumn(name = "traction_type_id")
    private TractionType tractionType;

    @ManyToOne()
    @JoinColumn(name = "case_type_for_suvPickupOffroad_id")
    private CaseTypeForSuvPickupOffroad caseTypeForSuvPickupOffroad;
}
