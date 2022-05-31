package customerDAO;

public class Customer {
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String password;
	private int age;
	private int ssn;
	private String subscriptiontype;
		
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		
		if (firstName.length() < 12)
		{
			this.firstName = firstName;
		}
		else
		{
			System.out.println("Name is not valid or more than 12 characters.");
		}
	}
	
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	public String getSubscriptiontype() {
		return subscriptiontype;
	}
	private void setSubscriptiontype() {
		this.subscriptiontype = "VIP";
	}

}
