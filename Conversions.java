package lab3;

import java.util.Scanner;

public class Conversions {
	public static void main(String[] args) {
		
		//Lab 3 part 1
		Scanner objA = new Scanner(System.in);
		System.out.println("1. This is to show assignment conversion:");
		System.out.println("Enter an int for a: ");
		Integer intA = objA.nextInt();
		System.out.println("Converted an int to a double by assignment.");
		System.out.println("int a is " + intA);
		double b = intA;
		System.out.println("double b is " + b);
		
		//Lab 3 part 2
		Scanner objC = new Scanner(System.in);
		System.out.println("2. This is to show promotion conversion:");
		System.out.println("Enter an int for c: ");
		Integer intC = objC.nextInt();
		Scanner objD = new Scanner(System.in);
		System.out.println("Enter a double for d: ");
		Double doubleD = objD.nextDouble();
		System.out.println("Assign c/d to e.");
		System.out.println("int c is " + intC);
		System.out.println("double d is " + doubleD);
		Double doubleE =  intC / doubleD;
		System.out.println("output e is " + doubleE);
		
		//Lab 3 part 3
		Scanner objF = new Scanner(System.in);
		System.out.println("3. This is to show casting conversion:");
		System.out.println("Enter a double for f:");
		Double doubleF = objF.nextDouble();
		Scanner objG = new Scanner(System.in);
		System.out.println("Enter an integer for g");
		Integer intG = objG.nextInt();
		System.out.println("Assign f/g to h.");
		double castH = doubleF / intG;
		int intH = (int) castH;
		System.out.println("double f is " + doubleF);
		System.out.println("int g is " + intG);
		System.out.println("output h is "+ intH);
		
			
	}

}
