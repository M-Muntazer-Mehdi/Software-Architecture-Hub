package Polymorphism;

class base{
	base()
	{
		System.out.print("Base class constructor\n");
	}
	public void fun1(int x)
	{
		System.out.print("Base class Function value is : " + x + "\n");
	}
};

class derived extends base{
	derived()
	{
		System.out.print("Derived class constructor\n");
	}
	public void fun1(int x)
	{
		System.out.print("Derived class Function value is : " + x + "\n");
	}
};

public class Dynamic_Polymorphism_Function_Overriding {
	public static void main(String[] args)
	{
		base b = new base();
		base d = new derived();
		b.fun1(10);
		d.fun1(10);
	}
}
