package ass4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList 
{
	public static void main (String[]args)
	{
		ArrayList <String> R = new ArrayList <String>();
		
		R.add("Paris");
		R.add("Kotor");
		R.add("Budva");
		R.add("Girokaster");
		R.add("Albania");
		
		System.out.println("Before reverse");
		//I thought .topArray might work but I think it's
		// showing the memory location?? 
		System.out.println(R.toArray());
		System.out.println(R.toString());

		
		
		Collections.reverse(R);  
        System.out.println("After Reversing");  
        System.out.println(R);  
		
	}
}
