package abstractDemo.Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService customerCheckservice;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckservice) {
		super();
		this.customerCheckservice = customerCheckservice;
	}
	
	@Override
	public void save(Customer customer) {

	      
		System.out.println(customer.getFirstName()+" kaydedildi");
	
	}		
}
