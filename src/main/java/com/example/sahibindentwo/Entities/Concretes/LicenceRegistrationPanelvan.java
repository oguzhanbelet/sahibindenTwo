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
@Table(name = "licenseRegistraionsOfPanelvans")
public class LicenceRegistrationPanelvan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "licence_registration_panelvan_id")
    private int licenseRegistrationPanelvanId;

    @Column(name = "licence_registration_panelvan_name")
    private String licenseRegistrationPanelvanName;

    @OneToMany(mappedBy = "licenceRegistrationPanelvan")
    private List<Panelvan> panelvans;
}
