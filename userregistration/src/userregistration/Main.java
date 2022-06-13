package userregistration;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		UserDAO userDAO = new UserDaoImpl();

		// Get all users
		System.out.println("________LIST OF ALL USERS________");
		userDAO.getUsers();
		System.out.println("\n");

		// Get user by Id
		System.out.println("________GET USER BY ID________");
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter id of the user :");
			int userId = scanner.nextInt();
			userDAO.getUserById(userId);
		} catch (Exception IndexOutOfBoundsException) {
			System.out.println("The id user does not exist !");

		}

		// update user
		System.out.println("________UPDATE EMAIL OF USER________");
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter id of the user to update :");
		int userId = scanner.nextInt();
		System.out.println("enter  new user email: ");
		String emailUserString = scanner.next();
		User user = userDAO.getUserById(userId);
		user.setEmail(emailUserString);
		userDAO.getUsers();

		// Delete User
		System.out.println("________DELETE A USER ________");
		Scanner scan = new Scanner(System.in);
		System.out.println("enter id of the user to remove :");
		int userIdToDelete = scan.nextInt();
		User user1 = userDAO.getUserById(userIdToDelete - 1);
		userDAO.deleteUser(user1);

		// Add User
		System.out.println("________ADD A USER ________");
		userDAO.addUser(null);
		userDAO.getUsers();

	}

}
