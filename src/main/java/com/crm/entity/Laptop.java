package com.crm.entity;

import jakarta.persistence.*;

@Entity
@Table(name="jpa_laptops")
public class Laptop {
    @Id
    private int laptopId;
    private String laptopModel;
    private String Brand;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Laptop() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Laptop(int laptopId, String laptopModel, String Brand,Student student){
        this.laptopId=laptopId;
        this.laptopModel=laptopModel;
        this.Brand=Brand;
        this.student=student;
    }
    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getLaptopModel() {
        return laptopModel;
    }

    public void setLaptopModel(String laptopModel) {
        this.laptopModel = laptopModel;
    }





}
