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

		double Lenght = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("Length of Line : " + Lenght);
	}
}