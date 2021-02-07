/*
 * Exercise :15
 * insertion sort
 * */

public class Demo14 {

	public static void main(String[] args) {
		int[] arr=new int[] {10,1,5,15,6,9};
		sort(arr);

	}
	static void sort(int[] arr)
	{
		int len=arr.length;
		for (int i = 1; i < len; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		for (int k : arr) {
			System.out.print(k + " ");
		}
		 
		
		 
	}

}
//for (int i = 0; i < len; i++) {
//	for (int j = 1; j < len-i; j++) {
//		if(arr[j-1]>arr[j])
//		{
//			arr[j-1]=arr[j-1]+arr[j];
//			arr[j]=arr[j-1]-arr[j];
//			arr[j-1]=arr[j-1]-arr[j];
//			
//		}
//		
//	}
//	
//}
