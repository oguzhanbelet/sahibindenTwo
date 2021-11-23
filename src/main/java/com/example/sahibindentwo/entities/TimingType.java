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
@Table(name = "timing_types")
public class TimingType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "timing_type_id")
    private int timingTypeId;

    @Column(name = "timing_type_name")
    private String timingTypeName;

    @OneToMany(mappedBy = "timingType")
    private List<Motorcycle> motorcycles;
}
