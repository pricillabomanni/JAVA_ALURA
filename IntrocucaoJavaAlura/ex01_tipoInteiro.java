package ExeJavaAlura;

import java.util.Scanner;

public class tipoInteiro {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = teclado.nextInt(); 
		System.out.println("sua idade é: " + idade  + " anos.");
		
	
		
	}
}
