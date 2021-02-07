
/*
 * Exercise :11
 * Area of geometric figures
 * */

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose any one of the following");
		System.out.println("1:triangle");
		System.out.println("2:rectangle");
		System.out.println("3:circle");
		System.out.println("4:square");
		int x=sc.nextInt();
	   switch(x)
	   {
	   case 1:System.out.println("enter side value :");
	          int tside=sc.nextInt();
	          System.out.println("enter height value :");
	          int theight=sc.nextInt();
		      tArea(tside,theight);
		      break;
	   case 2:
		      System.out.println("enter length value :");
              int rlength=sc.nextInt();
              System.out.println("enter height value :");
              int rheight=sc.nextInt();
              rArea(rlength,rheight);
              break;
	   case 3:
		      System.out.println("enter radius value :");
              int radius=sc.nextInt();
              cArea(radius);
              break;
	   case 4:System.out.println("enter side value :");
              int side=sc.nextInt();
              sArea(side);
              break;
	   }
	   sc.close();
	}
	static void tArea(int a,int b)
	{
		System.out.println("area of triangle="+(0.5*a*b));
	}
	static void rArea(int a,int b)
	{
		System.out.println("area of rectangle="+(a*b));
	}
	static void cArea(int a)
	{
		System.out.println("area of circle="+(3.14*a*a));
	}
	static void sArea(int a)
	{
		System.out.println("area of square="+(a*a));
	}
	

}
