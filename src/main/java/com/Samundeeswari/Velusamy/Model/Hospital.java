package com.Samundeeswari.Velusamy.Model;


import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity

@Table
public class Hospital implements Serializable {
    @Serial

    private static final long serialVersionUID = 1L;
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hospitalId;
    private String hospitalName;
    private String address;




    public Hospital(String hospitalName, String address) {
        this.hospitalName = hospitalName;
        this.address = address;
           }

    public Hospital(){}




    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalId=" + hospitalId +
                ", hospitalName='" + hospitalName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}


