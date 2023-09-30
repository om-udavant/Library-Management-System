
import java.sql.*;

public class Conn {

	Connection c;
	Statement s;
	
	Conn(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("Jdbc:mysql://localhost:3307/library", "root", "root");
			s = c.createStatement();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
