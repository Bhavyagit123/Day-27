package com.codegnan.assignmentquestions;

abstract class Employee {
	protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    public void display() {
        System.out.println("Employee Name: " + name);
    }
}


