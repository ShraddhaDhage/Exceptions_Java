package Exceptions;
import java.util.*;

import javax.crypto.AEADBadTagException;
public class Propogation 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
		
		
		try {
			System.out.println(division(a,b));
		} catch (ArithmeticException e) 
		{
			System.out.println("Dont divide by zero");
		}
		
	}
	
	public static int division(int num,int deno)
	{
		int rs=num/deno;
		return rs;
	}
}
