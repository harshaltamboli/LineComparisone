package com.harshal.linecompproblem;

import java.util.Scanner;

public class LineCompProblem {
	
	

	public static void main(String[] args){
		
		int x1;
		int x2;
		int y1 = 0;
		int y2;
		double Lenght;  
		
		Scanner scanner =new Scanner(System.in);
		

		System.out.println("Welcome To Line Computation Program");
		
		System.out.println("Enter The x1,y1 and x2,y2 point for the line");
		
		
		x1= scanner.nextInt();
		x2= scanner.nextInt();
		y1= scanner.nextInt();
		y2= scanner.nextInt();
		
		Lenght= Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		System.out.println("Lenght of line"+Lenght);
	}

	
}
