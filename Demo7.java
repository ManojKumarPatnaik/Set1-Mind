/*
 * Exercise :8
 * reverse of a number
 * */


import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			 rev=rev*10+rem;
			 num=num/10;
		}
		System.out.println(rev);

	}

}
