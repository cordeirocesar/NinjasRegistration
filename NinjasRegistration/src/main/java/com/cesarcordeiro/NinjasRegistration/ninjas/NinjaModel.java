package com.cesarcordeiro.NinjasRegistration.ninjas;


import com.cesarcordeiro.NinjasRegistration.missions.MissionsModel;
import jakarta.persistence.*;

// Entity Convert a class into a database entity
// JPA = Java Persistence API
@Entity
@Table(name = "tb_ninja_registration")
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


    public NinjaModel() {
    }

    public NinjaModel(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
