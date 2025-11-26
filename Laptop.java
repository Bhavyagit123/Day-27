package com.codegnan.assignmentquestions;

import java.util.Scanner;

public class Laptop extends Gadget {
    @Override
    public String getUse() {
        return "Work";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();
        Gadget gadget;

        if (type.equals("Phone")) {
            gadget = new Phone();
        } else {
            gadget = new Laptop();
        }

        System.out.println(gadget.getUse());
    }

}
