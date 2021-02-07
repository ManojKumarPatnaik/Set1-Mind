
/*
 * Exercise :6
 * Method receives name as parameter
 * */

import java.util.*;
public class Demo5 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		String name=sc.nextLine();
		name=stringValidate(name);
		print(name);

	}
	private static String stringValidate(String name) {
		while(!name.matches("[a-zA-Z\\s]+"))
		{
			if(!name.isEmpty())
			{
				System.out.println("Please retype:");
			}
			name=sc.nextLine();
		}
		return name;
	}
	public static void print(String s)
	{
		System.out.println("Hello "+s+" !");
	}

}
