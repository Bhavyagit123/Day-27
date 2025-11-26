package com.codegnan.assignmentquestions;

public class ContractEmployee extends Employee {
    private double contractAmount;

    public ContractEmployee(String name, double contractAmount) {
        super(name);
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return contractAmount;
    }

    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee("Alice", 50000);
        Employee e2 = new PartTimeEmployee("Bob", 500, 40);
        Employee e3 = new ContractEmployee("Charlie", 75000);

        Employee[] employees = { e1, e2, e3 };

        for (Employee emp : employees) {
            emp.display();
            System.out.println("Salary: " + emp.calculateSalary());
            System.out.println("----------------------");
        }
    }

}
