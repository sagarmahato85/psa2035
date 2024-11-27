package com.crm.entity;

import jakarta.persistence.*;

@Entity
@Table(name="jpa_address")
public class Address {
    @Id
    private int id;
    private String city;
    private String state;
    private String country;

    @ManyToOne
    @JoinColumn(name="student_id")
            private Student student;
    public Address(){

    }
    Address(int id,String city,String state,String country){
        this.id=id;
        this.city=city;
        this.state=state;
        this.country=country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
