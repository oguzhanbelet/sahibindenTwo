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
@Table(name = "chasisForPanelvans")
public class ChasisForPanelvan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chasis_for_panelvan_id")
    private int chasisForPanelvanId;

    @Column(name = "chasis_for_panelvan_name")
    private String chasisForPanelvanName;

    @OneToMany(mappedBy = "chasisForPanelvan")
    private List<Panelvan> panelvans;

}
