
package com.harshal.linecompproblem;

import java.util.Scanner;

public class LineCompProblem {
		
	int x1;
	int x2;
	int y1;
	int y2;
	String line;
	
	
	public void lineInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the X1,Y1 and X2,Y2 points for the Line:");
		
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
	}
	
	public double lineCalculate() {
		
			return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));	
	}
	
	public void lineCheck(LineCompProblem linecompproblem2)

	{
		if(this.lineCalculate() == linecompproblem2.lineCalculate()) {
			
			
		
			System.out.println("Both Line are Same");
		}
        else if(this.lineCalculate() > linecompproblem2.lineCalculate()) {
			
			System.out.println("Line 1 is Greter than Line 2");
		}
		else {
			
			System.out.println("Line 2 is Greter then Line 1");
		}	
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation Program ");
		
		LineCompProblem linecompproblem1 = new LineCompProblem();
		LineCompProblem linecompproblem2 = new LineCompProblem();
		
		linecompproblem1.lineInput();
		linecompproblem2.lineInput();
	
		linecompproblem1.lineCheck(linecompproblem2);
	}
}
