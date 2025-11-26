package com.codegnan.assignmentquestions;

import java.util.Scanner;

public class Calculator {
	 public final int FACTOR = 2;

	    public final int getResult(int number, int code) {
	        if (code == 1) {
	            return number * FACTOR;
	        } else if (code == 2) {
	            return number / FACTOR;  // integer division
	        } else {
	            return 0;  // default case (not required, but safe)
	        }
	    }
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int number = sc.nextInt();
	        int code = sc.nextInt();

	        Calculator calc = new Calculator();
	        int result = calc.getResult(number, code);

	        System.out.println(result);
	    }

}
