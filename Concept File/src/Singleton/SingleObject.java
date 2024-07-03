package Singleton;

public class SingleObject {
	//make a private object
	private static SingleObject Bl = new SingleObject();
	
	//make a private constructor
	private SingleObject()
	{
		
	}
	
	//make a public function return type : class
	public static SingleObject getobject()
	{
		return Bl;
	}
	
	public void fun()
	{
		System.out.print("Hello world");
	}
}
