import java.util.Scanner;

public class Example {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		boolean temp=false;
		String str;
		do
		{
			System.out.println("Enter string ::");
			str=sc.nextLine();
			temp=stringVaidate(str);
			
		}
		while(!temp);
		
		boolean result=checkPalindrom(str);
		if(result)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		
	}
	private static boolean stringVaidate(String str) {
		int len=str.length();
		int n,count=0;
		for (int i = 0; i < len; i++) {
			n=str.charAt(i);
			if((n>65 && n<90)|| (n>97 && n<122))
			{
				count++;
			}
		}
		if(count==len)
		{
			return true;
		}
		return false;
		
	}
	private static boolean checkPalindrom(String str) {
		int len=str.length();
		int count=0;
		int flag=len/2;
		for (int i = 0; i < len/2; i++) {
			if(str.charAt(i)==str.charAt(len-i-1))
			{
				count++;
			}
		}
		/*
		 * System.out.println(count); System.out.println(flag);
		 */
		if(count==flag)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
