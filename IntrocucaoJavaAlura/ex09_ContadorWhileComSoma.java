package ExeJavaAlura;

public class ContadorWhileComSoma {
	public static void main(String[] args) {
	
		int total = 0, contador=0;
		
		while(contador <= 10) {
			total += contador;
			System.out.println(total);
			contador++;
		}
		
	}
}
