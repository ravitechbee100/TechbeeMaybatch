package userregistrationJDBC;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {
	List<User> getUsers();

	User getUserById(int id);

	void updateUser(User user);

	boolean deleteUser(User user);

	void addUser(User user) throws SQLException;
	

}
