package userregistration;

import java.util.regex.Pattern;

public class User {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String usernName;
	private int age;
	private int id;

	public User() {

	}

	public User(String firstName, String lastName, String phoneNumber, String email, String usernName, int age,
			int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.usernName = usernName;
		this.age = age;
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstNameValidation(firstName);
	}

	public void setFirstName(String firstName) {
		this.firstName = firstNameValidation(firstName);
		;
	}

	public String getLastName() {

		return lastNameValidation(lastName);
	}

	public void setLastName(String lastName) {
		this.lastName = lastNameValidation(lastName);
	}

	public String getPhoneNumber() {
		return phoneNumberValidation(phoneNumber);
	}

	public String setPhoneNumber(String phoneNumber) {
		return this.phoneNumber = phoneNumberValidation(phoneNumber);
	}

	public String getEmail() {

		return emailValidation(email);
	}

	public void setEmail(String email) {
		this.email = emailValidation(email);
	}

	public String getUsernName() {
		return usernName;
	}

	public void setUsernName(String usernName) {
		this.usernName = usernName;
	}

	public int getAge() {

		return ageValidation(age);
	}

	public void setAge(int age) {
		this.age = ageValidation(age);
	}

	// VALIDATION

	public static String firstNameValidation(String firstName) {
		if (firstName == null || firstName.isEmpty()) {
			return "name should not be empty";
		}

		String firstNameRegEx = "^[a-zA-Z]{3,24}$";

		Pattern pattern = Pattern.compile(firstNameRegEx);
		if (!(pattern.matcher(firstName).matches())) {
			return "Invalid first  name\\n";
		}
		return firstName;

	}

	public static String lastNameValidation(String lastName) {
		if (lastName == null || lastName.isEmpty()) {
			return "\nlast name should not be empty\n";
		}

		String lastNameRegEx = "(?i)(^[a-z])((?![ .,'-]$)[a-z .,'-]){0,24}$";

		Pattern pattern = Pattern.compile(lastNameRegEx);
		if (!(pattern.matcher(lastName)).matches()) {
			return "\nInvalid last name\n";
		}
		return lastName;

	}

	public static String phoneNumberValidation(String phoneNumber) {
		if (phoneNumber == null || phoneNumber.isEmpty()) {
			return "\nphone  should not be empty\n";
		}

		String phoneNumberRegEx = "^(\\+\\d{1,2}\\s?)?1?\\-?\\.?\\s?\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]?\\d{4}$";

		Pattern pattern = Pattern.compile(phoneNumberRegEx);
		if (!(pattern.matcher(phoneNumber).matches())) {
			return "\nInvalid phone number form\n";
		}
		return phoneNumber;

	}

	public static String emailValidation(String email) {
		if (email == null || email.isEmpty()) {
			return "Email should not be empty\n";
		}

		String emailRegEx = "^(.+)@(.+)$";

		Pattern pattern = Pattern.compile(emailRegEx);
		if (!(pattern.matcher(email).matches())) {
			return "\nInvalid email  form\n";
		}
		return email;

	}

	public static int ageValidation(int age) {
		if (age < 18 && age > 120) {

			return 0;
		}
		return age;

	}

}
