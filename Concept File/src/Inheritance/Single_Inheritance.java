package Inheritance;

class base{
	public int length;
	public int width;
	base()
	{
		System.out.print("Constructor of base class\n");
	}
	base(int a, int b)
	{
		this.length = a;
		this.width = b;
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
};

class derived extends base{
	int area;
	derived()
	{
		System.out.print("Constructor of derived class\n");
	}
	public void area()
	{
		System.out.print("Area is : " +getArea() + "\n");
	}
	public int getArea() {
		return area;
	}
	public void setArea(int a, int b) {
		this.area = a * b;
	}
};

public class Single_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		derived d = new derived();
		d.setLength(2);
		d.setWidth(4);
		d.setArea(d.getLength(), d.getWidth());
		d.area();

	}

}
