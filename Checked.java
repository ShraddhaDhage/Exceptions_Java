package Exceptions;

public class Checked
{
	public static void main(String[] args) 
	{
		
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("I love BHARAT");
			//Thread.sleep(2000);
		}
		
		try
		{
			Thread.sleep(500000
					);
		}
		catch (InterruptedException e)
		{
			System.out.println("Exception Occured");
		}
	}
}
