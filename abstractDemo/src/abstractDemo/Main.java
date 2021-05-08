package abstractDemo;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Entities.Customer;
import abstractDemo.Concrete.NeroCustomerManager;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		
		customerManager.save(new Customer(1,"Engin",
				"Demiroð",LocalDate.of(1985,5 , 25),"12345678910"));
		
		// TODO Auto-generated method stub
// bursý string den mi felaketti
	//	evet birde bazý yerlerde yanlýþ customer ý çaðýrmýþtýn ötekini silin bence ha
	}

}
