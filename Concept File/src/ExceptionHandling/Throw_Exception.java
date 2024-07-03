package ExceptionHandling;

import java.util.Scanner;

class base extends Exception{
	@Override
	public String getMessage()
	{
		return "Number is increased the limit";
	}
}

public class Throw_Exception {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = sc.nextInt();
		if(number < 5)
		{
			try
			{
				throw new Exception("Exception called.\n");
			}catch(Exception e)
			{
				System.out.print(e.getMessage());
			}
		}
		else
		{
			System.out.print("Number is greater than 5\n");
		}
	}
}
