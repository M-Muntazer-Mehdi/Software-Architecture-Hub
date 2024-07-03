package Testing;

public class Mainclass {
	private int num1;
	private int num2;
	
	public Mainclass(int num3, int num4)
	{
		this.num1 = num3;
		this.num2 = num4;
	}

	public Mainclass() {
		// TODO Auto-generated constructor stub
	}
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int add ()
	{
		return num1+num2;
	}
	
	public int minus ()
	{
		return num1-num2;
	}
	
	public static int findmin(int arr[])
	{
		int min = 0;
		for(int i = 0; i <arr.length; i++) 
		{
			if(min<arr[i])
			{
				min = arr[i];
			}
		}
		for(int i = 0; i <arr.length; i++) 
		{
			if(min>arr[i])
			{
				min = arr[i];
			}
		}
		return min;
	}
}
