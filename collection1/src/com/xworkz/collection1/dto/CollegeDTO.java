package com.xworkz.collection1.dto;

import java.io.Serializable;

public class CollegeDTO implements Serializable {

    private String name;
    private double fee;
    private int noOfStudent;
    private int noOfTeachers;
    private String founder;

    public CollegeDTO() {
        System.out.println("printes a no-args constructor");
    }

    public CollegeDTO(String name, double fee, int noOfStudent, int noOfTeachers, String founder) {
        this.name = name;
        this.fee = fee;
        this.noOfStudent = noOfStudent;

        this.noOfTeachers = noOfTeachers;
        this.founder = founder;
    }

    public String getName() {
        return name;
    }

    public double getFee() {
        return fee;
    }

    public int getNoOfStudent() {
        return noOfStudent;
    }

    public int getNoOfTeachers() {
        return noOfTeachers;
    }

    public String getFounder() {
        return founder;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void setNoOfStudent(int noOfStudent) {
        this.noOfStudent = noOfStudent;
    }

    public void setNoOfTeachers(int noOfTeachers) {
        this.noOfTeachers = noOfTeachers;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                ", fee=" + fee +
                ", noOfStudent=" + noOfStudent +
                ", noOfTeachers=" + noOfTeachers +
                ", founder='" + founder + '\'' +
                '}';
    }


}
