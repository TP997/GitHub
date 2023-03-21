package com.thanuja.helloProject;

public class Employee {
    private final String empname;
    public int empid;
    public String name;
    public int age;
    public boolean isManager;
    public Employee(String empname, int empid, int age, boolean isManager){
    this.empname=empname;
    this.empid=empid;
    this.age=age;
    this.isManager=isManager;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "empname='" + empname + '\'' +
                ", empid=" + empid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isManager=" + isManager +
                '}';
    }
}
