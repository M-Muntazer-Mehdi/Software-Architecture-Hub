package ExceptionHandling;

import java.util.Scanner;

public class Try_catch_finally {
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to search : ");
		int num1 = sc.nextInt();
		System.out.print("Enter number to divide : ");
		int num2 = sc.nextInt();
		try
		{
			System.out.print("Enter index is arr[" + num1+ "] : " +arr[num1]+"\n");
			System.out.print("Divide value od arr[" + num1+ "] is :  " +arr[num1]/num2 + "\n");
		}
		catch(ArithmeticException ex)
		{
			System.out.print("Arthmetic Exception : " +ex+ "\n");
		}
		catch(NullPointerException ex1)
		{
			System.out.print("Null Pointer Exception : " +ex1+ "\n");
		}
		catch(IndexOutOfBoundsException ex2)
		{
			System.out.print("Out of Bound Exception : " +ex2+ "\n");
		}
		catch(Exception e)
		{
			System.out.print("Out of Bound Exception : " +e+ "\n");
		}
		finally
		{
			System.out.print("Finally called....");
		}
	}
}
