/*
 * Exercise :21
 * validate USN
 * */

import java.util.Scanner;

public class Demo20 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your USN :");
		String usd=sc.nextLine();
		sc.close();
		int len=usd.length();
        if(len==10)
        {
        	if(usd.charAt(0)=='1'||usd.charAt(0)=='2')
        	{
        	  if(Character.isUpperCase(usd.charAt(1)))
              {
                if(Character.isUpperCase(usd.charAt(2)))
                {
        	      if(Character.isDigit(usd.charAt(3))) 
        	        {
        	    	  if(Character.isDigit(usd.charAt(4))) 
            	       {
                         if(usd.charAt(5)=='C'||usd.charAt(5)=='E'||usd.charAt(5)=='I'||usd.charAt(5)=='M')
                          {
                        	if(usd.charAt(6)=='S'||usd.charAt(6)=='C'||usd.charAt(6)=='E')
                        	 {
                        		if(Character.isDigit(usd.charAt(7)))
                        	    {
                        		 if(Character.isDigit(usd.charAt(8)))
                        		  {
                        			if(Character.isDigit(usd.charAt(9)))
                        			 {
                        					System.out.println("Success");
                        				}
                        			}
                        		}
                        	}
                        		
                        	}
                        }
            	    }
        	    }
	}}}
        else 
        {
          System.out.println("Failure");	
        }

}
}