package ExceptionHandling;

import java.util.Scanner;

class negativeException extends Exception{
	@Override
	public String toString()
	{
		return "Negative number...";
	}
	@Override
	public String getMessage()
	{
		return "Negative number...";
	}
}

public class Throws_Exception {
	
	public static double area(int radius) throws negativeException
	{
		if(radius < 0)
		{
				throw new negativeException();
		}
		else
		{
			radius = 2 * radius * radius;
			return radius;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		
		try {
			double num1 = area(num);
			System.out.print(num1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
