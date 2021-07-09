package linecomparision;

import java.util.Scanner;

public class LineComparision {

	
	private void lengthOfLines(int x1, int y1, int x2, int y2, int p1, int q1, int p2, int q2) {
		Double length_of_line1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		Double length_of_line2 = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));

		System.out.printf("length of 1st end points are : %.2f %n", length_of_line1);
		System.out.printf("length of 2nd end points are : %.2f %n", length_of_line2);
		equal(length_of_line1, length_of_line2);
		compare(length_of_line1, length_of_line2);
	}

	/* equals method is declared here */
	private void equal(Double length_of_line1, Double length_of_line2) {
		boolean val = length_of_line1.equals(length_of_line2);

		if (val)
			System.out.println("length of both lines are equal");
		else
			System.out.println("length of both lines are not equal");
	}

	/* compare method is declared here */
	private void compare(Double length_of_line1, Double length_of_line2) {
		int com = length_of_line1.compareTo(length_of_line2);
		if (com > 0)
			System.out.println("Length of first end points is greater than length of second end points");
		else if (com < 0)
			System.out.println("Length of first end points is less than length of second end points");
		else
			System.out.println("length of both lines are equal.");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computation program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter co-ordinate x1 : ");
		int x1 = sc.nextInt();
		System.out.println("Enter co-ordinate y1 : ");
		int y1 = sc.nextInt();
		System.out.println("Enter co-ordinate x2 : ");
		int x2 = sc.nextInt();
		System.out.println("Enter co-ordinate y2 : ");
		int y2 = sc.nextInt();
		System.out.println("Enter x co-ordinate of third point: ");
		int p1 = sc.nextInt();
		System.out.println("Enter y co-ordinate of third point: ");
		int q1 = sc.nextInt();
		System.out.println("Enter x co-ordinate of forth point: ");
		int p2 = sc.nextInt();
		System.out.println("Enter y co-ordinate of forth point: ");
		int q2 = sc.nextInt();
		sc.close();

		LineComparision lc = new LineComparision();
		lc.lengthOfLines(x1, y1, x2, y2, p1, q1, p2, q2);
	}

}
