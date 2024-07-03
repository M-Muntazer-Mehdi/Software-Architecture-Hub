package InterfaceSegregationPrinciple;

public class LoanAccount implements Loan{

	/*@Override
	public void Withdraw() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("This is not used in loan class");
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("This is not used in loan class");
	}*/

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.print("Loan \n");
	}

	@Override
	public void loanSettlement() {
		// TODO Auto-generated method stub
		System.out.print("Settlement \n");
	}

	@Override
	public void Accountinfo() {
		// TODO Auto-generated method stub
		System.out.print("Accountinfo \n");
	}

}
