import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
  private static final String DB_URL = "jdbc:mysql://localhost:3306/database_name";
  private static final String DB_USER = "root";
  private static final String DB_PASSWORD = "root1234";

  public boolean validateLogin(LoginModel loginModel) {
	  try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		    e.printStackTrace();
		}

    try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement statement = connection.prepareStatement("SELECT COUNT(*) FROM users WHERE username = ? AND password = ?")) {
      statement.setString(1, loginModel.getUsername());
      statement.setString(2, loginModel.getPassword());

      try (ResultSet resultSet = statement.executeQuery()) {
        if (resultSet.next()) {
          int count = resultSet.getInt(1);
          return count == 1;
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return false;
  }
}
