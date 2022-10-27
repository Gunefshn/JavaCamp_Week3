package interfaces;

public class CustomerManager {
	private ICustomerDal customerDal;
	
	public CustomerManager (ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void Add() {
		//iş kodları
		customerDal.Add();
		
	}
}
