/*
 * Exercise :5
 * Sum of elements in different sized array
 * */

public class Demo4 {

	public static void main(String[] args) {
		
		
		double[] arr=new double[] {10.0,20.0,30.0,70.0,80.0};	
		double[] arr2=new double[] {20.0,50.0,30.0};
		
		if(arr.length>arr2.length) {
			double[] sum=new double[arr.length];
			for(int i=0;i<sum.length;i++)
			{
			   if(arr.length>i)
			   {
				   sum[i]+=arr[i];
			   }
			   if(arr2.length>i)
			   {
				   sum[i]+=arr2[i];
			   }

			}
			for(double s:sum)
		    	System.out.println(s);
			
		}
		else
		{
			double[] sum=new double[arr2.length];
			for(int i=0;i<sum.length;i++)
			{
			   if(arr.length>i)
			   {
				   sum[i]+=arr[i];
			   }
			   if(arr2.length>i)
			   {
				   sum[i]+=arr2[i];
			   }

			}
			for(double s:sum)
		    	System.out.print(s+" ");
		}
		
    	
	}

}
