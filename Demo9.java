/*
 * Exercise :10
 * prime numbers in given range
 * */


import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		sc.close();
		print(start,end);

	}
	static void print(int a,int b)
	{
		int count=0;
		for(int i=a;i<=b;i++)
		{
			if(i==1||i==0)
				continue;
			count=0;
				for(int j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						count++;
						break;
						
					}
				}
				
				if(count==0)
				{
					System.out.print(i);
					System.out.print(",");
			}
		}
	}

}
