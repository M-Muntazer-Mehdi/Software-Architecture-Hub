package DependencyInversionPrinciple;

public class Book implements Product{
	
	public void seeReviews()
	{
		System.out.print("See Reviews \n");
	}
	
	public void getSample()
	{
		this.readSample();
	}
	
	public void readSample()
	{
		System.out.print("read Sample \n");
	}
}
