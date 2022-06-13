package customerDAO;

public class MamoClient {

	public static void main(String[] args) {
		CustomerDAO mamocustomer = new CustomerDAO();

		Customer izundu = new Customer();
		izundu.setFirstName("Izundu");
		izundu.setLastName("Nasa");
		izundu.setAge(21);
		izundu.setEmailAddress("izundunasa@gmail.com");

		mamocustomer.addNewCustomer(izundu);

		Customer amir = new Customer();
		amir.setFirstName("Amir");
		amir.setLastName("Madaoui");
		amir.setAge(21);
		amir.setEmailAddress("amir@gmail.com");

		mamocustomer.addNewCustomer(amir);

		Customer obinna = new Customer();
		obinna.setFirstName("obinna");
		obinna.setLastName("M");
		obinna.setAge(21);
		obinna.setEmailAddress("obinna@gmail.com");

		mamocustomer.addNewCustomer(obinna);
		System.out.println("---------Display customers----------");
		mamocustomer.display();
		System.out.println("---------Update customer----------");
		mamocustomer.update(obinna);
		mamocustomer.display();
		System.out.println("---------Delete  customer----------");
		mamocustomer.deleteaCustomer(obinna);
		mamocustomer.display();

	}

}
