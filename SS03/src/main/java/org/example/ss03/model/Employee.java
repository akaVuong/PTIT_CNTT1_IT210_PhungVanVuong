package org.example.ss03.model;

public class Employee {
    private int id;
    private  String fullname;
    private  String departmant;
    private double salary;

    public Employee(){}

    public Employee(double salary, String departmant, String fullname, int id) {
        this.salary = salary;
        this.departmant = departmant;
        this.fullname = fullname;
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartmant() {
        return departmant;
    }

    public void setDepartmant(String departmant) {
        this.departmant = departmant;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
