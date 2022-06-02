package org.example;

public class Main {
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

        // mamocustomer.showAllCustomers();
    }
}