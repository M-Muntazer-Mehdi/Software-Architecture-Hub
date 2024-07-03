package DependencyInversionPrinciple;

public class DVD implements Product {

	public void seeReviews()
	{
		System.out.print("See reviews \n");
	}
	
	public void getSample()
	{
		this.watchSample();
	}
	
	public void watchSample()
	{
		System.out.print("Watch Sample \n");
	}
	
}
