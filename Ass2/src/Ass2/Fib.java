/**
 * 
 */
package Ass2;
import java.util.Scanner;  // Import the Scanner class
/**
 * @author Hadiqa
 *
 */
public class Fib {

public static void main(String[] args) 
 {
			  
	int n, firstNum = 0, secondNum = 1;
			  
	Scanner fibNum = new Scanner(System.in);// Create a Scanner object
	System.out.println("Enter a number: ");
	n = fibNum.nextInt();
	//int num = fibNum.nextInt();
			
	        
	System.out.println("Fibonacci Series Upto " + n + ": ");
		    
	 while (firstNum <= n) {
	 System.out.print(firstNum + ", ");
	 int nextNum = firstNum + secondNum;
	 firstNum = secondNum;
	 secondNum = nextNum;
		    }
 }
}
