/*
 * Exercise :17
 * Initials from full name 
 * */


import java.util.Scanner;

public class Demo16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value :");
		int n=sc.nextInt();
		System.out.println("enter a string :");
		String str=sc.next();
		int length=str.length();
		int count=0;
		for (int i = 0; i < length; i++) {
			System.out.println(str.charAt(i));
			count++;
			if(count==n)
			{
				System.out.println();
			}
			
		}
		/*
		 * System.out.println("enter your name :"); String str=sc.nextLine();
		 */
		/*
		 * char x='P'; int n=x; System.out.println(n);
		 */
		sc.close();
		//String str="PraveenKumarChowdary";
		/*
		 * int len=str.length();
		 * 
		 * for(int i=0;i<len;i++) { int ch=str.charAt(i); if(ch>64&&ch<91) {
		 * System.out.print(str.charAt(i)); }
		 * 
		 * }
		 */

	}

}
