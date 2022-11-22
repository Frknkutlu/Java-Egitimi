package interfaces;

public class CustomerManager {
	
	private ICustomerDal customerDal;
		
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	//iş kodları yazılır.
	public void add() {  
		customerDal.add();
	}
}
