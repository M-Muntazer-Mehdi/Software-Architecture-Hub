package DependencyInversionPrinciple;

public class Shelf {
	
	Product product;
	
	void addBook(Product product1)
	{
		this.product = product1;
		product1.seeReviews();
		System.out.print("Add book \n");
	}
	
	void customizeShelf()
	{
		product.getSample();
		System.out.print("Customize shelf \n");
	}

}
