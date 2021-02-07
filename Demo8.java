
/*
 * Exercise :9
 * Prime number or not
 * */

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		if(isPrime(num))
		System.out.println("True");
		else
			System.out.println("False");

	}
	public static boolean isPrime(int n)
	{
	  if(n==2) 
		  return true;
	  if(n<2)
		  return false;
	  
		if(n%2==0)
		{
			return false;
		}
		else
		{
			for(int i=3;i<=n/2;i+=2)
			{
				if(n%i==0)
					return false;
			}
			return true;
		}
	}

}
