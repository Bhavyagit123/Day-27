package com.codegnan.assignmentquestions;

import java.util.Scanner;

public class Drum extends Instrument {
    @Override
    public String getSound() {
        return "Beat";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();
        Instrument inst;

        if (type.equals("Guitar")) {
            inst = new Guitar();
        } else {
            inst = new Drum();
        }

        System.out.println(inst.getSound());
    }

}
