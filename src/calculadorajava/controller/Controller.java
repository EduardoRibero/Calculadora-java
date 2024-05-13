package calculadorajava.controller;

import calculadorajava.model.Repository;

import calculadorajava.model.Service;

public class Controller {
	
	private Service service = new Service();
	
	public String operacao(String valor1, String operacao, String valor2){
		Repository jpa = new Repository();
		double resultado;
		String resultadoString = "";
		
		switch (operacao) {
			case "soma": {
				resultado = service.somar(Double.valueOf(valor1).doubleValue(), Double.valueOf(valor2).doubleValue());
				resultadoString = Double.toString(resultado);
			}break;
			case "subtrair": {
				resultado = service.subtrair(Double.valueOf(valor1).doubleValue(), Double.valueOf(valor2).doubleValue());
				resultadoString = Double.toString(resultado);
			}break;
			case "dividir": {
				resultado = service.dividir(Double.valueOf(valor1).doubleValue(), Double.valueOf(valor2).doubleValue());
				resultadoString = Double.toString(resultado);
			}break;	
			case "multiplicar": {
				resultado = service.multiplicar(Double.valueOf(valor1).doubleValue(), Double.valueOf(valor2).doubleValue());
				resultadoString = Double.toString(resultado);
			}break;
		}
		
		jpa.conectar();
		jpa.inserirDados(valor1, operacao, valor2, resultadoString);
		jpa.close();
		
		return resultadoString;
	}
}
