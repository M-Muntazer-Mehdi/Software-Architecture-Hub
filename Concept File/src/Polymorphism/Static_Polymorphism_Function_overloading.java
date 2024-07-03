package Polymorphism;

class overloading{
	overloading()
	{
		System.out.print("Constructor call\n");
	}
	public void fun1()
	{
		System.out.print("funtion without parameter\n");
	}
	public void fun1(int x)
	{
		System.out.print("funtion with parameter : " + x + "\n");
	}
	public void fun1(String x)
	{
		System.out.print("funtion with parameter but different datatype : " + x + "\n");
	}
};

public class Static_Polymorphism_Function_overloading {
	public static void main(String[] args)
	{
		overloading O = new overloading();
		O.fun1();
		O.fun1(10);
		O.fun1("Hello");
	}
}
