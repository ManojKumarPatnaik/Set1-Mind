/*
 * Exercise :13
 * Search an element
 * */



import java.util.*;
public class Demo12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr=new int[] {1,3,4,6,7,8};
		System.out.println("enter key vaule:");
		int key=sc.nextInt();
		int len=arr.length;
		sc.close();
		
		if(isSearch(arr,0,len,key))
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

}
