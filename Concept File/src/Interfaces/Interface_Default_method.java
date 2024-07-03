package Interfaces;

interface int1
{
    void getLength(int length);
    void getWidth(int width);
    default void getArea()
    {
    	System.out.print("Find Area. \n");
    }
};

class base implements int1{
	int length;
	int width;
	int area;
	public void getLength(int a)
	{
		this.length = a;
	}
	public void getWidth(int b)
	{
		this.width = b;
	}
	public void getArea()
	{
		this.area = length * width; 
	}
	public void area()
	{
		System.out.print("Area is : " + area + "\n");
	}
};

class ayyas extends base{
	
}

public class Interface_Default_method {
	public static void main(String[] args)
	{
		base b = new base();
		b.getLength(2);
		b.getWidth(4);
		b.getArea();
		b.area();
	}
}
