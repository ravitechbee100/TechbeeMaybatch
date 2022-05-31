package userregistrationJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoSql implements UserDAO {
//	 static String query;
	static final String INSERT_USERS_SQL = "insert into users (firstName, lastName, phoneNumber,email,usernName,age,id) values\n"
			+ "(\"alain\", \"Boo\", \"1-143-436-6789\", \"boo@gmail.com\", \"boo99\", \"35\", \"4\"),\n"
			+ "(\"Aylan\", \"Madaoui\", \"1-125-495-9995\", \"Aylan@gmail.com\", \"aylan95\", \"125\", \"25\");";
	static final String GET_ALL_USERS_SQL = "select * from users;";
	static final String GET_USER_BY_ID = "select * from users where id='7';";
	static final String UPDATE_USER = "update users set firstName='BobHepo',id='7' where id='25'; ";
	static final String DELETE_USER="delete from users where id='4';";
	
	 Connection connection = null;
	 Statement statement = null;
	 ResultSet resultSet = null;
	
	public Connection getConnection() {

		final String url = "jdbc:mysql://users.cu2rzett61nl.us-west-1.rds.amazonaws.com:3306/user";
		final String username = "root";
		final String pass = "root";

		try {
			connection = DriverManager.getConnection(url, username, pass);

		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println("connected to db");
		return connection;

	}

	@Override
	public List<User> getUsers() {
		boolean rowDeleted;
		try {
			 Connection connection = getConnection();
			 Statement statement = connection.createStatement();
			resultSet = statement.executeQuery(GET_ALL_USERS_SQL);
			while (resultSet.next()) {
				System.out.println(resultSet.getString("firstName") + "-" + resultSet.getString("lastName") + "-"
						+ resultSet.getString("phoneNumber") + "-" + resultSet.getString("email") + "-"
						+ resultSet.getString("usernName") + "-" + resultSet.getString("age") + "-"
						+ resultSet.getString("id"));
			}
			System.out.println("Get all users.........Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User getUserById(int id) {
		try {
			connection =getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(GET_USER_BY_ID);
			while (resultSet.next()) {
				System.out.println(resultSet.getString("firstName") + "-" + resultSet.getString("lastName") + "-"
						+ resultSet.getString("phoneNumber") + "-" + resultSet.getString("email") + "-"
						+ resultSet.getString("usernName") + "-" + resultSet.getString("age") + "-"
						+ resultSet.getString("id"));
			}
			System.out.println("Get user by id.........Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void updateUser(User user) {
		try {
			Connection connection = getConnection();
			Statement statement = connection.createStatement();
			statement.executeUpdate(UPDATE_USER);

			System.out.println("Update users.........Done");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean deleteUser(User user) {
		boolean rowDeleted = false;
		try {
			Connection connection = getConnection();
			Statement statement = connection.createStatement();
			statement.executeUpdate(DELETE_USER);
			 rowDeleted = statement.executeUpdate(DELETE_USER) > 0;
			System.out.println("Delete users.........Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowDeleted;


	}

	@Override
	public void addUser(User user) throws SQLException {
		try {
			Connection connection = getConnection();
			Statement statement = connection.createStatement();
			int countInserted = statement.executeUpdate(INSERT_USERS_SQL);
			System.out.println("Insert users.........Done");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
