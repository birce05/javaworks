package abstractDemo;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Entities.Customer;
import abstractDemo.Concrete.NeroCustomerManager;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		
		customerManager.save(new Customer(1,"Engin",
				"Demiro?",LocalDate.of(1985,5 , 25),"12345678910"));
		
		// TODO Auto-generated method stub
// burs? string den mi felaketti
	//	evet birde baz? yerlerde yanl?? customer ? ?a??rm??t?n ?tekini silin bence ha
	}

}
