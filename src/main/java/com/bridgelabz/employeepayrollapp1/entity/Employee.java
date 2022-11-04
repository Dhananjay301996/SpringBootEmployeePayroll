package com.bridgelabz.employeepayrollapp1.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Address_ID")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "candidate_Id")
    private List<EducationDetails> educationDetails = new ArrayList<>();

    private String firstName;
    private String lastName;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Employee(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(List<EducationDetails> educationDetails) {
        this.educationDetails = educationDetails;
    }

    public List<EducationDetails> getEducationDetails() {
        return educationDetails;
    }

    public void setEducationDetails(List<EducationDetails> educationDetails) {
        this.educationDetails = educationDetails;
    }
}
