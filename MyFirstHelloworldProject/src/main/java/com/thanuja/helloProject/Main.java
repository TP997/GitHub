package com.thanuja.helloProject;

public class Main {
    public static void main (String[] args){
        Bird Eagle=new Bird();
        Eagle.color="brown";
        Eagle.canFly=true;


        Vehicle car= new Vehicle();
        car.nooftyres=4;
        car.noofdoors=4;
        car.maxspeed=60;
        car.mileage=40;


//        Employee emp= new Employee();
//        emp.empid=1;
//        emp.name="thanuja";
//        emp.age=32;
//        emp.isManager=true;

        Employee emp2= new Employee("abc",2,45,false);
        System.out.println(emp2);




    }
}
