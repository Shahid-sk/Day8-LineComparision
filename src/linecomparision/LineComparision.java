package linecomparision;

import java.util.Scanner;

public class LineComparision {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computation program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter co-ordinate x1 : ");
		double x1 = sc.nextDouble();
		System.out.println("Enter co-ordinate y1 : ");
		double y1 = sc.nextDouble();
		System.out.println("Enter co-ordinate x2 : ");
		double x2 = sc.nextDouble();
		System.out.println("Enter co-ordinate y2 : ");
		double y2 = sc.nextDouble();

		System.out.println("Enter x co-ordinate of third point: ");
		double p1 = sc.nextInt();
		System.out.println("Enter y co-ordinate of third point: ");
		double q1 = sc.nextInt();
		System.out.println("Enter x co-ordinate of forth point: ");
		double p2 = sc.nextInt();
		System.out.println("Enter y co-ordinate of forth point: ");
		double q2 = sc.nextInt();
		sc.close();

		Double length_of_line1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		Double length_of_line2 = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));

		System.out.printf("length of 1st end points are : %.2f %n", length_of_line1);
		System.out.printf("length of 2nd end points are : %.2f %n", length_of_line2);
		boolean val = length_of_line1.equals(length_of_line2);
		if (val)
			System.out.println("Both lines are equal.");
		else
			System.out.println("Both lines are not equal.");
	}
}