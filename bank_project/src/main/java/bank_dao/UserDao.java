package bank_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

import bank_dto.User;

public class UserDao 
{

	public static Connection createConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_db?createDatabaseIfNotExist=true&user=root&password=root");
	}
	public static int registerUser(User user) throws ClassNotFoundException, SQLException {
		Connection connection=createConnection();
		PreparedStatement ps=connection.prepareStatement("create table if not exists user_details(id int auto_increment primary key, name varchar(50),mobile bigint,email varchar(50) unique,age int,password varchar(50))");
		ps.execute();
		ps.close();
		PreparedStatement ps2=connection.prepareStatement("insert into user_details(name,mobile,email,age,password) values(?,?,?,?,?)");
		ps2.setString(1, user.getName());
		ps2.setLong(2, user.getMobile());
		ps2.setString(3, user.getEmail());
		ps2.setInt(4, user.getAge());
		ps2.setString(5, user.getPassword());
		int result=ps2.executeUpdate();
		ps2.close();
		connection.close();
		return result;
	}
	public static int login(String email, String password) throws ClassNotFoundException, SQLException {
		Connection connection=createConnection();
		PreparedStatement ps=connection.prepareStatement("select email,password from user_details where email=?");
		ps.setString(1, email);
		ResultSet res=ps.executeQuery();
		if(res.next())
		{
			if(!password.equals(res.getString("password"))) 
			{
				ps.close();
				connection.close();
				return -1;
			}
			else 
			{
				ps.close();
				connection.close();
				return 1;
			}
		}
		else 
		{
			ps.close();
			connection.close();
			return 0;
		}
	}
	public static int forgotPassword(String email, String password) throws SQLException, ClassNotFoundException  {
		Connection connection=createConnection();
		PreparedStatement ps=connection.prepareStatement("select email from user_details where email=?");
		ps.setString(1, email);
		ResultSet res=ps.executeQuery();
		if(res.next())
		{
			PreparedStatement ps1=connection.prepareStatement("update user_details set password=? where email=?");
			ps1.setString(1, password);
			ps1.setString(2, email);
			int result=ps1.executeUpdate();
			ps1.close();
			connection.close();
			return result;
		}
		connection.close();
		return 0;
	}
	
}
