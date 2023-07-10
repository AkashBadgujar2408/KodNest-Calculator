package com.kodnest.trainings.infiniteloops;

import java.util.Scanner;

public class KodNestCalculatorApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calculate = new Calculator();
		char ch;
		while (true) {
			System.out.println("Hello Welcome to Kodnest Calculator App");
			System.out.println("+ ------------> addition");
			System.out.println("- ------------> subtraction");
			System.out.println("* ------------> multiplication");
			System.out.println("/ ------------> division");
			System.out.println("% ------------> findRemainder");
			System.out.println("^ ------------> findSquare");
			System.out.println("! ------------> Stop/Exit");
			ch = scan.next().charAt(0);
			if (ch=='!') {
				System.out.println("Exiting the app");
				return;
			}
			
			switch (ch) {
			case '+': calculate.addition();
					  break;
			case '-': calculate.subtraction();	
			  		  break;
			case '*': calculate.multiplication();	
	  		  		  break;
			case '/': calculate.division();
	  		  	  	  break;
			case '%': calculate.findRemainder();
	  	  	  		  break;
			case '^': calculate.findSquare();
					  break;
	  	  	default: System.out.println("Please enter only one of the allowed input");
	  	  	  
			}
		}
	}
}
