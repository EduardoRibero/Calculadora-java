package calculadorajava.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Repository {
	
	public void add (String valor1, String operacao, String valor2, String res){
		String url = "jdbc:postgresql://localhost:5432/db_calculadorajava";
        String user = "postgres";
        String password = "admin";
        String sql = "INSERT INTO tb_calculadorajava (valor1, operacao, valor2, res) VALUES (?, ?, ?, ?)";
        Connection connection;
       
        
        try {
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, valor1);
            statement.setString(2, operacao);
            statement.setString(3, valor2);
            statement.setString(4, res);
            statement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Falha na conexão!");
            e.printStackTrace();
        }
	}
	
	
    public ArrayList<String> get(){
		String url = "jdbc:postgresql://localhost:5432/db_calculadorajava";
        String user = "postgres";
        String password = "admin";
        String sql = "SELECT * FROM tb_calculadorajava";
        ArrayList<String> res = new ArrayList();
        Connection connection;
        ResultSet result;
        
        try{
        	connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = connection.prepareStatement(sql);
            result = statement.executeQuery();

            while(result.next()) {
            	res.add(result.getString("res")+" = "+result.getString("valor2")+ result.getString("operacao") +result.getString("valor1"));
            }
            
            connection.close();
        }catch(Exception e){
			e.printStackTrace();
        }
        
		return res;
    }
}
