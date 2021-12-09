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
@Table(name = "case_types_for_suvPickupOffroads")
public class CaseTypeForSuvPickupOffroad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "case_type_for_suvPickupOffroad_id")
    private int caseTypeForSuvPickupOffRoadId;

    @Column(name = "case_type_for_suvPickupOffroad_name")
    private String caseTypeForSuvPickupOffRoadName;

    @OneToMany(mappedBy = "caseTypeForSuvPickupOffroad")
    private List<SuvPickUpOffRoad> suvPickUpOffRoads;
}
