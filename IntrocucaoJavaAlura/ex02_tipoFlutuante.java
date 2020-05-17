package ExeJavaAlura;

import java.util.Scanner;

public class tipoFlutuante {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Digite seu salario: ");
		double salario = teclado.nextDouble();
		
		System.out.println("Seu salario é: " + salario);
	}
}
