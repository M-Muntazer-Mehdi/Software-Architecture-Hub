package Inheritance;

class base_1{
	public int length;
	public int width;
	public int height;
	base_1()
	{
		System.out.print("Base class constructor\n");
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
};

class derived_1 extends base_1{
	public int area;
	derived_1()
	{
		System.out.print("Derived_1 class constructor\n");
	}
	public int getArea() {
		return area;
	}
	public void setArea(int a, int b) {
		this.area = a * b;
	}
	public void area()
	{
		System.out.print("Area is : " + getArea() +"\n");
	}
};

class derived_2 extends base_1{
	public int volume;
	derived_2()
	{
		System.out.print("Derived_2 class constructor\n");
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int a, int b, int c) {
		this.volume = a * b* c;
	}
	public void volume()
	{
		System.out.print("Volume is : " + getVolume() +"\n");
	}
};

class derived_3 extends base_1{
	public int perimeter;
	derived_3()
	{
		System.out.print("Derived_3 class constructor\n");
	}
	public int getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(int a ,int b) {
		this.perimeter = 2 * (a + b);
	}
	public void perimeter()
	{
		System.out.print("Perimeter is : " +getPerimeter() + "\n");
	}
};

public class Hierarchical_Inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		derived_1 d1 = new derived_1();
		d1.setLength(2);
		d1.setWidth(4);
		d1.setHeight(6);
		d1.setArea(d1.getLength(), d1.getWidth());
		d1.area();
		
		derived_2 d2 = new derived_2();
		d2.setVolume(d1.getLength(), d1.getWidth(), d1.getHeight());
		d2.volume();
		
		derived_3 d3 = new derived_3();
		d3.setPerimeter(d1.getLength(), d1.getWidth());
		d3.perimeter();
	}
}
