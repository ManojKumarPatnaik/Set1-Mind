/*
 * Exercise :20
 * Invoke compareTo Method
 * */

import java.util.ArrayList;
import java.util.List;

public  class Demo19 
{
	public static void main (String[] args)
	{
		String[] strings= {"praveen","kumar","chowdary"};
		List<String> value=new ArrayList<String>();	
		value.add("praveen");
		value.add("kunar");
		System.out.println("praveen".compareTo("kumar"));
		System.out.println(strings[1].compareTo(strings[2]));
     }
	
}