/*
 * Exercise :3
 * Hailstone sequence
 * */




import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Intialize an integer value");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.close();
		int count=0;
		while(a!=1) {
		if(a%2==0)
		{
			int m=a/2;
			System.out.println(a+" is even so i take half : "+m);
			a=m;
		}
		else
		{
			int n=3*a+1;
			System.out.println(a+" is odd so i make 3n+1 : "+n);
			a=n;
		}
			count++;
		}
			System.out.println("There are total "+count+" steps to reach 1");
		    
		
		
	

}
}
