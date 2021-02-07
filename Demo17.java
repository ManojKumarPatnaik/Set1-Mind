/*
 * Exercise :18
 * Generates password from initials
 * */

import java.util.Scanner;

public class Demo17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name :");
		String Fname=sc.nextLine();
		System.out.println("enter Middle name :");
		String Mname=sc.nextLine();
		System.out.println("enter Last name :");
		String Lname=sc.nextLine();
		System.out.println("enter age :");
		int age=sc.nextInt();
		sc.close();
		
		System.out.print(Fname.charAt(0));
		System.out.print(Mname.charAt(0));
		System.out.print(Lname.charAt(0));
		System.out.print(age);
	}

}
