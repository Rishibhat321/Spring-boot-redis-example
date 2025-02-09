package com.springbootredisexample.redisdemo.model;

import java.io.Serializable;

public class Employee implements Serializable {

    // defining fields
    private int id;
    private String name;
    private String department;

    // define constructors
    public Employee() {

    }

    public Employee(String department, int id, String name) {
        this.department = department;
        this.id = id;
        this.name = name;
    }

    // define getters/setters


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
