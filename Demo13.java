/*
 * Exercise :14
 * Binary search for integer and strings
 * */


import java.util.Scanner;
public class Demo13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr=new int[] {1,3,4,6,7,8};
		String[] arr2=new String[] {"AA","BC","RF","SX"};
		
		System.out.println("enter search string :");
		System.out.println("enter key vaule:");
				String key2=sc.nextLine();
				int key=sc.nextInt();
				sc.close();

		int len=arr.length;
		if(isSearch(arr,0,len,key))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(isString(arr2,key2))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}
	static boolean isSearch(int a[],int low,int high,int key )
	{
		//double number=100.0;
		//int x=(int)number;
		
		if(high>=low)
		
		{
		int mid=(low+high)/2;
		if(key==a[mid])
			return true;
		
		if(key>a[mid])
			return isSearch(a,mid+1,high,key);
		else 
			return isSearch(a,low,mid-1,key);
		
		}
		return false;	
	}
	static boolean isString(String[] a,String k)
	{
		int low=0;
		int high=a.length-1;
		int mid;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(a[mid].compareTo(k)<0)
			{
				low=mid+1;
			}
			else if(a[mid].compareTo(k)>0)
			{
				high=mid-1;
			}
			else
			{
				return true;
			}
		}
		return false;
	}

}
