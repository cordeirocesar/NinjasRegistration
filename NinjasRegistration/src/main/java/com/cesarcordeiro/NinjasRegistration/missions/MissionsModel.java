package com.cesarcordeiro.NinjasRegistration.missions;

import com.cesarcordeiro.NinjasRegistration.ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missions")
public class MissionsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String difficulty;

    @OneToMany(mappedBy = "mission")
    private List<NinjaModel> ninjas;




}
