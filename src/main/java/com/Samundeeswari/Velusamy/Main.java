package com.Samundeeswari.Velusamy;

import com.Samundeeswari.Velusamy.Model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        manyToOne();
//        oneToMany();
//        oneToOne();
        manyToMany();
    }
    public static void manyToMany() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Doctors doctor1=new Doctors("Mani");
        Doctors doctor2=new Doctors("Thilaga");

        Set<Doctors> doctorsSet1=new HashSet<Doctors>();
        Set<Doctors> doctorsSet2=new HashSet<Doctors>();

        doctorsSet1.add(doctor1);
        doctorsSet1.add(doctor2);

        doctorsSet2.add(doctor2);
        doctorsSet2.add(doctor1);

        session.persist(doctor1);
        session.persist(doctor2);

        Patients p1 = new Patients("Sam","8 kasturi Bai st, coimbatore",doctorsSet1);
        Patients p2 = new Patients("Vedu","pimpri chinch wad, pune",doctorsSet2);

        session.persist(p1);
        session.persist(p2);

        transaction.commit();


    }

    public static void oneToOne() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        DoctorSchedule doctorSchedule1 = new DoctorSchedule("Annual",new Date(2024-05-31));
        DoctorSchedule doctorSchedule2 = new DoctorSchedule("checkup",new Date(2023-04-21));

        session.persist(doctorSchedule1);
        session.persist(doctorSchedule2);

        Doctors doctor1=new Doctors("Mary");
        Doctors doctor2=new Doctors("John");

//        doctor1.setDoctorSchedule(doctorSchedule1);
//        doctor2.setDoctorSchedule(doctorSchedule2);

        session.persist(doctor1);
        session.persist(doctor2);

        transaction.commit();



    }

    public static void oneToMany() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

//        Hospital hospital1=new Hospital("Govt Hospital","12 Ram Nagar, TamilNadu");
//        Hospital hospital2=new Hospital("Private Hospital","63 Sita Nagar, TamilNadu");


        Doctors doctor1=new Doctors("Vedika");
        Doctors doctor2=new Doctors("Samundeeswari");
        Doctors doctor3=new Doctors("Jennifer");
        Doctors doctor4 =new Doctors("John");

        // Creating Speciality

        ArrayList<Doctors> doctorsArrayList=new ArrayList<Doctors>();
        doctorsArrayList.add(doctor1);
        doctorsArrayList.add(doctor2);
        doctorsArrayList.add(doctor3);
        doctorsArrayList.add(doctor4);

        session.persist(doctor1);
        session.persist(doctor2);
        session.persist(doctor3);
        session.persist(doctor4);

        Speciality speciality = new Speciality();
        speciality.setName("Gynoglogist");
        speciality.setDoctorsList(doctorsArrayList);

        session.persist(speciality);
        transaction.commit();

    }

    public static void manyToOne() {
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        //Creating Hospitals

        Hospital hospital1=new Hospital("Govt Hospital","12 Ram Nagar, TamilNadu");
        Hospital hospital2=new Hospital("Private Hospital","63 Sita Nagar, TamilNadu");

        //Crating Teachers
//        Doctors doctor1=new Doctors("Vedika",hospital1);
//        Doctors doctor2=new Doctors("Samundeeswari",hospital2);
//        Doctors doctor3=new Doctors("Jennifer",hospital2);
//        Doctors doctor4 =new Doctors("John",hospital1);

        session.persist(hospital1);
        session.persist(hospital2);

//        session.persist(doctor1);
//        session.persist(doctor2);
//        session.persist(doctor3);
//        session.persist(doctor4);

        transaction.commit();



    }
}