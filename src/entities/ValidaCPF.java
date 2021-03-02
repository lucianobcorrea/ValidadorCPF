package entities;

import java.util.InputMismatchException;

public class ValidaCPF {
	
	public static boolean validaCPF(String CPF) {
		CPF = removeCarEspeciais(CPF);
		
		if(CPF.equals("11111111111") || CPF.equals("22222222222") ||
		   CPF.equals("33333333333") || CPF.equals("44444444444") ||
		   CPF.equals("55555555555") || CPF.equals("66666666666") ||
		   CPF.equals("77777777777") || CPF.equals("88888888888") ||
		   CPF.equals("99999999999") || CPF.equals("00000000000") ||
		   (CPF.length() != 11)) {
			return false;
		}
				
	char dig10, dig11;
	int num, peso, soma, resto;
	
	try {
		peso = 10; 
		soma = 0;

		//1º digito verificador;
		for(int i = 0; i < 9; i++) {
			num = (int)CPF.charAt(i) - 48;
			soma = soma + (num * peso);
			peso -= 1;	
		}
		
		soma *= 10;	
		resto = soma % 11;
		
		if(resto == 10) {
			dig10 = '0';
		}else {
			dig10 = (char)(resto + 48);
		}
		
		peso = 11;
		soma = 0;
		
		//2º digito verificador;
		for(int i = 0; i < 10; i++) {
			num = (int)CPF.charAt(i) - 48;
			soma = soma + (num * peso);
			peso -= 1;	
		}
		
		soma *= 10;	
		resto = soma % 11;
		
		if(resto == 10) {
			dig11 = '0';
		}else {
			dig11 = (char)(resto + 48);
		}
		
		//Compara os dois digitos calculados com aqueles que foram digitados pelo usuario;
		if(dig10 == CPF.charAt(9) && dig11 == CPF.charAt(10)) {
			return true;
		}else {
			return false;
		}
	}catch(InputMismatchException e) {
		return false;
	}
}
	
	public static String removeCarEspeciais(String carCPF) {
		if(carCPF.contains(".")) {
			carCPF = carCPF.replace(".", "");
		}
		if(carCPF.contains("-")) {
			carCPF = carCPF.replace("-", "");
		}
		if(carCPF.contains("/")) {
			carCPF = carCPF.replace("/", "");
		}
		return carCPF;
		//É necessário colocar o (CPF =) pois o método replace retorna uma nova String;
	}	
	
	
}

