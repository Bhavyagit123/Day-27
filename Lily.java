package com.codegnan.assignmentquestions;

import java.util.Scanner;

public class Lily extends Flower {
    @Override
    public String getType() {
        return "White";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();
        Flower flower;

        if (type.equals("Rose")) {
            flower = new Rose();
        } else {
            flower = new Lily();
        }

        System.out.println(flower.getType());
    }

}
