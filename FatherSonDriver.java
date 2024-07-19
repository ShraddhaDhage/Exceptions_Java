package Exceptions;

public class FatherSonDriver 
{
	public static void main(String[] args) 
	{
		Father f=new Father();
		
		try
		{
			Child ch=(Child)f;
		} 
		catch(ClassCastException e) 
		{
			System.out.println("Class cast exc can occur");
			System.out.println("Without upcasting don't do downcasting");
		}
		
		System.out.println("Process over");
	}
}
