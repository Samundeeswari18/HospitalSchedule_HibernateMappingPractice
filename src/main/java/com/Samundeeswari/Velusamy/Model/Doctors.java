package com.Samundeeswari.Velusamy.Model;
import com.Samundeeswari.Velusamy.Model.Hospital;

import jakarta.persistence.*;

import javax.print.Doc;
import java.io.Serial;
import java.io.Serializable;


@Table
@Entity
public class Doctors implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;


//
//    @OneToOne(cascade = CascadeType.ALL)
//    private DoctorSchedule doctorSchedule;

//    public DoctorSchedule getDoctorSchedule() {
//        return doctorSchedule;
//    }
//
//    public void setDoctorSchedule(DoctorSchedule doctorSchedule) {
//        this.doctorSchedule = doctorSchedule;
//    }
    //    @ManyToOne
//    private Hospital hospital;
//
//    public Doctors(String name, Hospital hospital) {
//        this.name = name;
//        this.hospital = hospital;
//    }



    public Doctors(String name) {
        this.name = name;
    }

    public Doctors(){}

//    public Hospital getHospital() {
//        return hospital;
//    }
//
//    public void setHospital(Hospital hospital) {
//        this.hospital = hospital;
//    }

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

    @Override
    public String toString() {
        return "Doctors{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}