package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("The first of two integers to be averaged?");
		double n1 = in.nextInt(); 
		System.out.println("The second?");
		double n2 = in.nextInt(); 
		System.out.println("Average of " + n1 + " and " + n2 + " is " + (n1+n2)/2);
		// TODO Auto-generated method stub

	}

}
