/*
 * Exercise :4
 * sum of elements of an array
 * */

public class Demo301 {

	public static void main(String[] args) {
		int[] arr=new int[]{10,20,30,40};
		int sum=0;
        for(int i=0;i<arr.length;i++)
        {
        	sum=sum+arr[i];
        }
        System.out.println(sum);
	}

}
