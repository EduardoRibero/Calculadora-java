package calculadorajava;

import calculadorajava.model.Repository;
import calculadorajava.view.Tela;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		Repository jpa = new Repository();
		jpa.conectar();
		new Tela();

	}

}
