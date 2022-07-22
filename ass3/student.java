import java.util.Scanner;

public class student
{
    public static void main(String args[])
    {
    	/* This program assumes that the student has 6 subjects,
    	 * thats why I have created the array of size 6. You can
    	 * change this as per the requirement.
    	 */
    	//creating an array
    			int scores[] = new int[3]; 
    			int i;
    			double total = 0, average;
    			
    			Scanner scanner = new Scanner(System.in);// Create a Scanner object
		
        
    			for (i=0; i<3; i=i+1)
    			{
    		       System.out.print("Enter Mark" +(i+1)+ ":");
    		       scores[i] = scanner.nextInt();
    		       total = total + scores[i];
    			}
    			
    			scanner.close();
    			average = total/3;
    			
    	        System.out.print("The Grade is: ");
    	        if(average>80)
    	        {
    	        	System.out.print("You've passed! ");
    	        }
    	        
    	        if(average <= 50)
    	        {
    	        	System.out.print("You've Failed the city! ");
    	        }
    	        
    	        else
    	        {
    	        	System.out.print("You did good ");

    	        }
    }
}