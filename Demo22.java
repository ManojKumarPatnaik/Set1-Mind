/*
 * Exercise :23
 * Consecutive character and count
 * */

import java.util.*;
public class Demo22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string :");
		String s=sc.nextLine();
		sc.close();
		String str="";
		 for(int i=0;i<s.length();i++)
	        {
	            int ch=s.charAt(i);
	            if(ch>64&&ch<91)
	            {
	                ch=ch+32;
	                str+=(char)ch;
	            }
	            else if(ch>96&&ch<123)
	            {
	            	str+=(char)ch;
	             }
	        }
		 show(str);
	}

public static void show(String str)
{
	    int len=str.length();
		int count=1;
		String[] arr=new String[len];
		List<String> values=new ArrayList<String>();
		
		for(int i=0;i<len-1;i++)
		{
			if(str.charAt(i+1)-str.charAt(i)==1)
			{
				char ch1=str.charAt(i);
				char ch2=str.charAt(i+1);
				if(ch1+1==ch2)
				{
					arr[i]=ch1+""+ch2;
				}
			}
		}
		for(String x:arr)
		{
			if(x!=null)
			{
				values.add(x);
			}
		}
		String[] result=values.toArray(new String[values.size()]);
		
		for(int i=0;i<result.length;i++)
		{
			for(int k=i+1;k<result.length;k++)
			{
				if(result[i].equals(result[k]))
			    {
					count++;
					result[k]="0";}
			}
			if(result[i]!="0")
			System.out.println(result[i]+""+count);
			count=1;
		}
	}
}
