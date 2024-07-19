package Exceptions;

import java.util.*;
public class Fin1
{
	public static void main(String[] args) 
	{
		Scanner sc=null;
		int num=sc.nextInt();
		try 
		{
			int res=10/2;
		}
		
		catch (NullPointerException ae)
		{
			System.out.println("cant divide by zero");
		}
		
		finally 
		{
			System.out.println("Process Over");
		}
	}
}
