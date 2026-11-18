package com.cesarcordeiro.NinjasRegistration.ninjas;


import com.cesarcordeiro.NinjasRegistration.missions.MissionsModel;
import jakarta.persistence.*;
import lombok.*;

// Entity Convert a class into a database entity
// JPA = Java Persistence API
@Entity
@Table(name = "tb_ninja_registration")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private int age;

    @ManyToOne
    @JoinColumn(name = "missions_id")
    private MissionsModel mission;



}
