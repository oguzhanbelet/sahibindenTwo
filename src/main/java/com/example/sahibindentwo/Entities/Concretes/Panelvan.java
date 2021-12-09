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
@Table(name = "panelvans")
public class Panelvan extends Vehicle {

    private boolean swap;

    @Column(name = "seatCount", nullable = true)
    @Size(min = 2, max = 25)
    private int seatCount;

    @ManyToOne()
    @JoinColumn(name = "traction_type_id")
    private TractionType tractionType;

    @ManyToOne()
    @JoinColumn(name = "case_type_for_panelvan_id")
    private CaseTypeForPanelvan caseTypeForPanelvan;

    @ManyToOne()
    @JoinColumn(name = "chasis_for_panelvan_id")
    private ChasisForPanelvan chasisForPanelvan;

    @ManyToOne()
    @JoinColumn(name = "licence_registration_panelvan_id")
    private LicenceRegistrationPanelvan licenceRegistrationPanelvan;

}
