package Exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);//new Scanner(System.in);
		try
		{
			System.out.println("Enter a numerator");
			int num=sc.nextInt();
			
		}
		
		catch (NullPointerException e) 
		{
			//System.out.println("we have stored reference with null so that exception can occur");
			System.out.println("please don't refer to Scanner class methods with null values");
		}
		
		catch (ArithmeticException ae) 
		{
			System.out.println("Dont divide by zero");
			// TODO: handle exception
		}
		
		catch (InputMismatchException e)
		{
			System.out.println("Please enter integer type data");
		}
		
		System.out.println("Thank you");
	}
}
