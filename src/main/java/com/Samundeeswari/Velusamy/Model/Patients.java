package com.Samundeeswari.Velusamy.Model;

import jakarta.persistence.*;
import java.util.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table
public class Patients implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;

    public Patients(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Patients() {}

    @ManyToMany(targetEntity = Doctors.class)
    private Set<Doctors> doctors;

    public Patients(String name,String address, Set<Doctors> doctors) {
        this.name = name;
        this.address = address;
        this.doctors = doctors;

    }

    public Set<Doctors> getDoctors() {
        return doctors;
    }

    public void setDoctors(Set<Doctors> doctors) {
        this.doctors = doctors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Patients{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
