/*
 * Exercise :24
 * Count sequence of character
 * */

import java.util.Scanner;

public class Demo23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		String s="";
		 for(int i=0;i<str.length();i++)
	        {
	            int ch=str.charAt(i);
	            if(ch>64&&ch<91)
	            {
	                ch=ch+32;
	                s+=(char)ch;
	            }
	            else if(ch>96&&ch<123)
	            {
	            	s+=(char)ch;
	             
	            }
	        
	        }
		 
		countstring(s);

	}
	static void countstring(String s) 
    { 
        for (int i = 0; i < s.length(); i++) { 
            int count = 1; 
            while (i + 1 < s.length()&& s.charAt(i) == s.charAt(i + 1)) { 
                i++; 
                count++; 
            } 
            System.out.print(s.charAt(i) + "" + count ); 
        } 
  
        System.out.println(); 
    } 
  

}
