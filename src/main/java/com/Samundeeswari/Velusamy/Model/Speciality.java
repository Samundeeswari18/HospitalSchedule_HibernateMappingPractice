package com.Samundeeswari.Velusamy.Model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table

public class Speciality implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public Speciality(String name) {
        this.name = name;
    }
    public Speciality() {}

    @OneToMany(targetEntity = Doctors.class, cascade ={CascadeType.ALL})
    private List<Doctors> doctorsList;


    public List<Doctors> getDoctorsList() {
        return doctorsList;
    }

    public void setDoctorsList(List<Doctors> doctorsList) {
        this.doctorsList = doctorsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
