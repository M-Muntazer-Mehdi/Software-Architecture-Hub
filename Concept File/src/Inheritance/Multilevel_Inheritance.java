package Inheritance;

class base0{
	public int length;
	base0()
	{
		System.out.print("Base class constructor\n");
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
};

class base1 extends base0{
	public int width;
	base1()
	{
		System.out.print("Base1 class constructor\n");
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
};

class derived1 extends base1{
	int area;
	derived1()
	{
		System.out.print("Derived class constructor\n");
	}
	public int getArea() {
		return area;
	}
	public void setArea(int a, int b) {
		this.area = a * b;
	}
	public void area()
	{
		System.out.print("Area is : " + getArea() + "\n");
	}
};

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		derived1 d = new derived1();
		d.setLength(2);
		d.setWidth(4);
		d.setArea(d.getLength(), d.getWidth());
		d.area();

	}

}
