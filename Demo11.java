
/*
 * Exercise :12
 * Bubble sort
 * */

public class Demo11 {

	public static void main(String[] args) {
		int[] arr=new int[] {-9,1,-4,2,8};
		sort(arr);

	}
	static void sort(int[] a)
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

}
