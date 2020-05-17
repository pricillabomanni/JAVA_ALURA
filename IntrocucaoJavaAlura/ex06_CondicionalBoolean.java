package ExeJavaAlura;

public class CondicionalBoolean {
	public static void main(String[] args) {
		
		int idade = 19;
		int quantidadePessoas = 3;
		boolean acompanhado = true;
		
		
		if (idade >= 18 || quantidadePessoas >=2) {
			System.out.println("Você é maior de idade ou está com mais pessoas!");
		}else {
			System.out.println("Você é menor de idade e está desacompanhado!");
		}

		if (idade >= 18 && quantidadePessoas >=2) {
			System.out.println("Você é maior de idade e está com mais pessoas!");
		}else {
			System.out.println("Você é menor de idade e está desacompanhado!");
		}
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Você é maior de idade e está acompanhado!");
		}else {
			System.out.println("Você é menor de idade e está desacompanhado!");
		}
		
		
	}
}
