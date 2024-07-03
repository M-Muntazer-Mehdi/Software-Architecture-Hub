package Abstract;

abstract class base{
	base()
	{
		System.out.print("Base class constructor\n");
	}
	abstract public void shape();
};

class derived extends base{
	derived()
	{
		System.out.print("Derived class constructor\n");
	}
	@Override
	public void shape()
	{
		System.out.print("Area class\n");
	}
};

abstract class derived1 extends base{
	derived1()
	{
		System.out.print("Derived1 class constructor\n");
	}
	public void shape1()
	{
		System.out.print("Volume class\n");
	}
};

public class Abstract_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// base b = new base(); --error
		derived d = new derived();
		d.shape();
		
		//derived1 d1 = new derived1(); -- error
		//d1.shape();
	}

}
