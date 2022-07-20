package Ass2;

public class reverse
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String r = reverse ("Mount Everest")	;
		System.out.println(r);
	}
	public static String reverse(String s)
	{
		char [] letters = new char[s.length()];
		
		int letterIndex = 0;
		for (int i=s.length()-1; i >=0; i--)
		{
			letters [letterIndex] = s.charAt(i);
			letterIndex++;
		}
		
		String reverse = "";
		for (int i =0; i<s.length(); i++)
		{
			reverse = reverse + letters [i];
		}
		return reverse;
	}
}
