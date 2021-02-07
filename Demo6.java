
/*
 * Exercise :7
 * Max Number
 * */

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int result=max(num1,num2,num3);
		System.out.println(result);
		sc.close();

	}
	public static int max(int a ,int b, int c)
	{
		if(a>b&&a>c) {

				return a;
	}
		else
		{
			if(b>c) {
				return b;}
			
		}
		return c;

}
}
