/*
 * Exercise :16
 * Bubble sort and insertion sort
 * */



import java.util.Scanner;

public class Demo15 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int[] arr=new int[] {10,1,5,15,6,9};
			System.out.println("choose type :");
			System.out.println("1:bubble sort");
			System.out.println("2:insertion sort");
			int x=sc.nextInt();
			sc.close();
			switch(x)
			{
			case 1:bSort(arr);
			       break;
			case 2:iSort(arr);
			       break;
			}
			

		}
		static void bSort(int[] a)
		{
			int len=a.length;
			int temp=0;
			for(int i=0;i<len;i++)
			{
				for(int j=1;j<len-i;j++)
				{
					if(a[j-1]>a[j])
					{
						temp=a[j-1];
						a[j-1]=a[j];
						a[j]=temp;
						
					}
				}
			}
			for(int s:a)
			{
				System.out.print(s+" ");
			}
		}
		static void iSort(int[] arr)
		{
			int len=arr.length;
			for(int i=1;i<len;i++)
			{
				int key=arr[i];
				int j=i-1;
				while(j>=0&&arr[j]>key)
				{
					arr[j+1]=arr[j];
					j=j-1;
				}
				arr[j+1]=key;
			}
			for(int k:arr)
			{
				System.out.print(k+" ");
			}
		}

	}


