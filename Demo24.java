/*
 * Exercise :25
 * Triplets
 * */
public class Demo24 {

	public static void main(String[] args) {
		int[] arr=new int[] {2,3,4,5,7};
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len-2;j++)
			{
				for(int k=j+1;k<len-1;k++)
				{
					if(arr[j]+arr[k]==arr[i])
					{
						System.out.print("<");
						System.out.print(arr[j]+",");
						System.out.print(arr[k]+",");
						System.out.print(arr[i]);
						System.out.println(">");
					}
				}
			}
		}

	}

}
