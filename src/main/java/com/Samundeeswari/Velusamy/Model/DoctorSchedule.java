package com.Samundeeswari.Velusamy.Model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table

public class DoctorSchedule implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;     //Annual or checkup
    private Date date;

    public DoctorSchedule(String type, Date date) {
        this.type = type;
        this.date = date;
    }
    public DoctorSchedule() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "DoctorSchedule{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", date=" + date +
                '}';
    }
}
