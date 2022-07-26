package ass4;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElements 
{
	public static void main (String[]args)
	{
		ArrayList <String> R = new ArrayList <String>();
		
		R.add("Paris");
		R.add("Kotor");
		R.add("Budva");
		R.add("Girokaster");
		R.add("Albania");
		
		System.out.println("Before swap: ");

		for (String s: R)
		{
		System.out.println(s);

		}
		System.out.println(R.toString());

		
        //Swapping 1st(index 0) element with
		//the 4th(index 3) element
		Collections.swap(R, 0, 3);  
        System.out.println("After Swap: ");  
        
        for (String c: R)
		{
		System.out.println(c);

		}		
	}
}
