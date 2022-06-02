package org.example;
import java.util.ArrayList;
import java.util.Iterator;

public class CustomerDAO {
    private ArrayList<Customer> mamocustomer = new ArrayList<>();

    //Customer c = new Customer();

    public void addNewCustomer(Customer c) {

        mamocustomer.add(c);
        System.out.println(c.getFirstName());
        System.out.println(c.getLastName());

    }

    public void display() {

        for(Customer customer : mamocustomer) {
            System.out.println("Customer Name: - " + customer.getFirstName());
            System.out.println("Customer Last Name: - " + customer.getLastName());

        }
    }

    //CRUD Create, Read, Update and Delete

    public void update(Customer c, String firstName, String lastName, String emailAddress, int ssn) {
        c.setFirstName(firstName);
        c.setLastName(lastName);
        c.setEmailAddress(emailAddress);
        c.setNumber(ssn);

    }

    public void deleteCustomer(Customer c) {
        //used code from https://www.geeksforgeeks.org/remove-element-arraylist-java/
        Iterator it = mamocustomer.iterator();
        while (it.hasNext()) {

            // Remove c using
            // Iterator.remove()
            Customer x = (Customer)it.next();
            if (x.equals(c))
                it.remove();
        }

    }
}
