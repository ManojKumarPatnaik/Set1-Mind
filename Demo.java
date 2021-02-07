/*Exercise :1
 * factorial of a number*/


import java.util.*;
public class Demo {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int input1;
		input1=sc.nextInt();
		long[] input2=new long[input1];
		for(int i=0;i<input1;i++)
		{
			input2[i]=sc.nextLong();
		}
		int result=getBill(input2);
		System.out.println(result);
		
	}
	private static int getBill(long[] input2) {
		int temp=0;
		int flag=0;
		for (int i = 0; i < input2.length; i++) {
			if(input2[i]>1000)
			{
		        flag=(int) (input2[i]-1000);
				temp=temp+(flag/10);
			}
			flag = 0;
		}
		return temp;
	}
}
