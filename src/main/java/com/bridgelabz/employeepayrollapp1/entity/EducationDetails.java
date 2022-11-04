package com.bridgelabz.employeepayrollapp1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Eduction_Details")
public class EducationDetails {
    @Id
    @GeneratedValue
    private int id;

    private String qulification;
    private String stream;
    private  String percentage;

    public EducationDetails() {
    }

    public EducationDetails(int id, String qulification, String stream, String percentage) {
        this.id = id;
        this.qulification = qulification;
        this.stream = stream;
        this.percentage = percentage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQulification() {
        return qulification;
    }

    public void setQulification(String qulification) {
        this.qulification = qulification;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }
}
