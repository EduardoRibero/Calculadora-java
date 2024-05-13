package calculadorajava.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Repository {
	
	public void conectar () throws ClassNotFoundException {
		String url = "jdbc:postgresql://localhost:5432/db_calculadorajava";
        String user = "postgres";
        String password = "admin";
        
        
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão bem-sucedida!");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Falha na conexão!");
            e.printStackTrace();
        }
	}
	
	
}
