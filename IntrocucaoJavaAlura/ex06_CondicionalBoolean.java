package ExeJavaAlura;

public class CondicionalBoolean {
	public static void main(String[] args) {
		
		int idade = 19;
		int quantidadePessoas = 3;
		boolean acompanhado = true;
		
		
		if (idade >= 18 || quantidadePessoas >=2) {
			System.out.println("Voc� � maior de idade ou est� com mais pessoas!");
		}else {
			System.out.println("Voc� � menor de idade e est� desacompanhado!");
		}

		if (idade >= 18 && quantidadePessoas >=2) {
			System.out.println("Voc� � maior de idade e est� com mais pessoas!");
		}else {
			System.out.println("Voc� � menor de idade e est� desacompanhado!");
		}
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Voc� � maior de idade e est� acompanhado!");
		}else {
			System.out.println("Voc� � menor de idade e est� desacompanhado!");
		}
		
		
	}
}
