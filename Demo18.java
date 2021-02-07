/*
 * Exercise :19
 * Change last names
 * */

import java.util.Scanner;

public class Demo18 {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String s1firstname=sc.nextLine();
	 String s1lastname=sc.nextLine();
	 String s2firstname=sc.nextLine();
	 String s2lastname=sc.nextLine();
     sc.close();
	 String news1name=s1firstname.concat(s2lastname);
	 String news2name=s2firstname.concat(s1lastname);
	 System.out.println(news1name);
	 System.out.println(news2name);
	 
	}

}
