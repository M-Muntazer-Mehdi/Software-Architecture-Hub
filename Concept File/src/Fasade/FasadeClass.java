package Fasade;

public class FasadeClass {
	private Shape circle;
	private Shape rectangle;
	
	public FasadeClass()
	{
		circle = new Circle();
		rectangle = new Rectangle();
	}
	
	public void drawCircle()
	{
		circle.draw();
	}
	
	public void drawRectangle()
	{
		rectangle.draw();
	}
}
