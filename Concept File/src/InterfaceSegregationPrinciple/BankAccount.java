package InterfaceSegregationPrinciple;

public class BankAccount implements Bank{

	@Override
	public void Withdraw() {
		// TODO Auto-generated method stub
		System.out.print("Withdraw \n");
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.print("Balance \n");
	}

	/*@Override
	public void loan() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("This is not used in bank class");
	}

	@Override
	public void loanSettlement() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("This is not used in bank class");
	}*/

	@Override
	public void Accountinfo() {
		// TODO Auto-generated method stub
		System.out.print("Accountinfo \n");
	}

}
