package main;

import java.util.Scanner;
import entities.ValidaCPF;

public class ValidaCpfMain {

	public static void main(String[] args) {
		Scanner lerCPF = new Scanner(System.in);
		
		String CPF;
		
		System.out.print("Informe um CPF: ");
		CPF = lerCPF.next();
		
		if(ValidaCPF.validaCPF(CPF) == true) {
			System.out.println("CPF V�LIDO");
		}else {
			System.out.println("CPF INV�LIDO");
		}
		
		lerCPF.close();
		
	}

}
