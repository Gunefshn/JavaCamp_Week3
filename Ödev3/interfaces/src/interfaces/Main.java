package interfaces;

public class Main {

	public static void main(String[] args) {
		
		//Interfaceler Newlenemezler
		//Bir class birden fazla interfaceleri implement edebilr.
		//Sadece bir sınıfı extends edebilir.
		//ICustomerDal iCustomerDal = new ICustomerDal();
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		//customerManager.customerDal = new OracleCustomerDal();
		customerManager.Add();
	}

}
