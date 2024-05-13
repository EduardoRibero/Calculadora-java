package calculadorajava.model;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Repository {
	private  Connection connection;
	
	public void conectar (){
		String url = "jdbc:postgresql://localhost:5432/db_calculadorajava";
        String user = "postgres";
        String password = "admin";
        
        
        try {
            connection = DriverManager.getConnection(url, user, password);
//            System.out.println("Conexão bem-sucedida!");
        } catch (SQLException e) {
            System.out.println("Falha na conexão!");
            e.printStackTrace();
        }
	}
	
    public void inserirDados(String valor1, String operacao, String valor2, String res) {
        String sql = "INSERT INTO tb_calculadorajava (valor1, operacao, valor2, res) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = this.connection.prepareStatement(sql)) {
            statement.setString(1, valor1);
            statement.setString(2, operacao);
            statement.setString(3, valor2);
            statement.setString(4, res);

            int linhasAfetadas = statement.executeUpdate();

            if (linhasAfetadas > 0) {
//                System.out.println("Dados inseridos com sucesso!");
            } else {
                System.out.println("Falha ao inserir dados.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao inserir dados: " + e.getMessage());
        }
   
    }
    
    public void close() {
    	try {
			connection.close();
//			System.out.println("Connection close!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
	
    public ArrayList<String> get(){
    	
        String sql = "SELECT * FROM tb_calculadorajava";
        ResultSet result;
        ArrayList<String> res = new ArrayList();
        
        try{
            PreparedStatement statement =this.connection.prepareStatement(sql);
            result = statement.executeQuery();
//            System.out.println("Get bem sucedido");
            while(result.next()) {
//            	System.out.println(result.getString("valor1"));
            	res.add(result.getString("res")+" = "+result.getString("valor2")+ result.getString("operacao") +result.getString("valor1"));
            }
        }catch(Exception e){
			e.printStackTrace();
        }
        
		return res;
    }
}
