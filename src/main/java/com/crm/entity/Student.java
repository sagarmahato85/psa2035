package com.crm.entity;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name="jpa_student")
public class Student {
    @Id
    public int StudentId;
    
    public String name;
    public String about;
     
    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private Laptop laptop;

    @OneToMany(mappedBy = "student",cascade=CascadeType.ALL)
    List<Address>address1=new ArrayList<>() ;

    public List<Address> getAddress1() {
        return address1;
    }

    public void setAddress1(List<Address> address1) {
        this.address1 = address1;
    }

    public Student() {

    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        this.StudentId = studentId;
    }
    Student(int StudentId,String name,String about,Laptop laptop){
        this.StudentId=StudentId;
        this.name=name;
        this.about=about;
        this.laptop=laptop;
    }
}
