package ass4;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;

public class ReplaceElmnt 
{

	public static void main (String[]args)
	{
		ArrayList <String> R = new ArrayList <String>();
		
		R.add("Paris");
		R.add("Kotor");
		R.add("Budva");
		R.add("Girokaster");
		R.add("Albania");
		
		System.out.println("Before replacing: " +R);
        
		
		// Replacing 3rd element with new value
		R.set(3, "Brazil");
		System.out.println("After Replacing: " +R);

	}
}
