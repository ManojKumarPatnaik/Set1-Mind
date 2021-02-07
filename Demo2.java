/*
 * Exercise :2
 * integer Table
 * */



import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Intialize an integer value");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		sc.close();
		tab(x);
	}
	static void tab(int a)
	{
	    for(int i=1;i<=12;i++)
	    {
	    	System.out.println(a+" * "+i+" = "+a*i);
	    }
	}

}
