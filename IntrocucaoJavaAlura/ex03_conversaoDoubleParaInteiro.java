package ExeJavaAlura;

public class conversaoDoubleParaInteiro {
	public static void main(String[] args) {
		
		/*"forçando" a variavel salario que recebeu um valor double
		 * a ser convertido para inteiro e ser atribuido para a variavel valor*/
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
	}

}
