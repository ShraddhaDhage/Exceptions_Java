package Exceptions;
import java.util.Scanner;
public class ArithmeticExc 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
			System.out.println("Enter a numerator: ");
			int numerator=sc.nextInt();
			
			System.out.println("Enter denominator");
			int deno=sc.nextInt();
			
			int res=numerator/deno;
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("Exception has occured and We are handling it");
			System.out.println("Can't divide by zero");
		}
		
		System.out.println("Thank you");
	}
}
