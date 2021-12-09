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
@Table(name = "case_types_for_panelvans")
public class CaseTypeForPanelvan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "case_type_for_panelvan_id")
    private int caseTypeForPanelvanId;

    @Column(name = "case_type_for_panelvan_name")
    private String caseTypeForPanelvanName;

    @OneToMany(mappedBy = "caseTypeForPanelvan")
    private List<Panelvan> panelvans;
}
