package userregistration;

import java.util.List;

public interface UserDAO {
	List<User> getUsers();

	User getUserById(int id);

	void updateUser(User user);

	void deleteUser(User user);

	void addUser(User user);

}
