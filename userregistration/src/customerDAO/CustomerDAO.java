package customerDAO;

import java.util.ArrayList;

import userregistration.User;

public class CustomerDAO {
private ArrayList<Customer> mamocustomer = new ArrayList<>();

	
	public void addNewCustomer(Customer c) {
		
		mamocustomer.add(c);
		System.out.println(c.getFirstName());
		System.out.println(c.getLastName());
		
	}
	
	public void display() {
		//System.out.println(mamocustomer.get(1));
		
			for(Customer customer : mamocustomer) {
				System.out.println("Customer Name: - " + customer.getFirstName());
				System.out.println("Customer Last Name: - " + customer.getLastName());

			}
	}
	
	//CRUD Create, Read, Update and Delete
	
	public void update(Customer c) {
		c.setFirstName("newfirst");
		c.setLastName("newlast");
		mamocustomer.add(c);

		
		
		
		
	}
	
	public void deleteaCustomer(Customer c) {
		c.getSsn();
		mamocustomer.remove(c);
		
		
	}
	public void addCustomer(User user) {
		
	}

}
