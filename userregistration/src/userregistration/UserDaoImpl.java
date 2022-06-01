package userregistration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class UserDaoImpl implements UserDAO {

	private List<User> users;

	public UserDaoImpl() {
		users = new ArrayList<User>();
		users.add(new User("AmiroucheLama", "Madaoui", "1-123-456-6789", "amir@gmail.com", "amir99", 30, 1));
		users.add(new User("Amirouche", "Mada", "1-123-499-9999", "amirouche@gmail.com", "amirouche99", 120, 2));

	}

	@Override
	public List<User> getUsers() {

		System.out.println("User id  " + "First name  " + "Last name  " + "Phone number  " + " Email  " + "User name  "
				+ " Age  ");
		for (User user : users) {
			System.out.println(user.getId() + " " + user.getFirstName() + " " + user.getLastName() + " "
					+ user.getPhoneNumber() + " " + user.getEmail() + " " + user.getUsernName() + " " + user.getAge());

		}
		return users;
	}

	@Override
	public User getUserById(int id) {

		System.out.println(users.get(id - 1).getId() + " " + users.get(id - 1).getFirstName() + " "
				+ users.get(id - 1).getLastName() + " " + users.get(id - 1).getPhoneNumber() + " "
				+ users.get(id - 1).getEmail() + " " + users.get(id - 1).getUsernName() + " "
				+ users.get(id - 1).getAge());

		return users.get(id - 1);

	}

	@Override
	public void updateUser(User user) {

		users.get(user.getId()).setEmail(user.getEmail());
		System.out.println("Email user updated ");
	}

	@Override
	public void deleteUser(User user) {
		users.remove(user.getId());

	}

	@Override
	public void addUser(User user) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First name:");
		String fname = sc.next();
		System.out.println("Last name:");
		String lname = sc.next();
		System.out.println("Phome number:");
		String phn = sc.next();
		System.out.println("Email  :");
		String email = sc.next();
		System.out.println("User name:");
		String uname = sc.next();
		System.out.println("\nAge    :\n");
		int age = sc.nextInt();
		System.out.println("\nid   :\n");
		int id = sc.nextInt();
		users.add(new User(fname, lname, phn, email, uname, age, id));

	}


	}

}
