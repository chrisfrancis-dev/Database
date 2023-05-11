package middleware;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Chris","root","root1234");
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("select * from records");
		while (resultset.next()) {
			System.out.println(resultset.getInt(1));
			System.out.println(resultset.getString(2));
		}
		connection.close();
//		ResultSet resultset2 = DriverManager.getConnection("","","").createStatement().executeQuery("");
//		PreparedStatement preparedstatement = connection.prepareStatement(select * from records);
//		preparedstatement.executeQuery();
		
		
	}

}
