package Exceptions;
import java.util.Scanner;
public class ImpExc
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter a number");
			String ip=sc.next();
			long num=Long.parseLong(ip);
			int sum=0;
			while (num>0)
			{
				sum+=num%10;
				num/=10;
			}
			
			if (sum%2==0)
			{
				System.out.println("Sum is even");
			}
			
			else
			{
				System.out.println("Sum is odd");
			}
		} 
		catch (NumberFormatException e) 
		{
			System.out.println("Please enter valid number");
	
		}
		
		catch (ArithmeticException e) 
		{
			System.out.println("cant divide by zero");
		}
		
		
	}
}
