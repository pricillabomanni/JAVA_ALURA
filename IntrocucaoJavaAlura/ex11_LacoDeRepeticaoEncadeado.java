package ExeJavaAlura;

public class LacoDeRepeticaoEncadeado {
	public static void main(String[] args) {
		int total = 0;
		
	for(int multiplicador = 1; multiplicador <=10; multiplicador++) {
		for(int multiplicado=1; multiplicado<=10; multiplicado++) {
			
			total = multiplicador * multiplicado;
			
			System.out.println(multiplicador + " x " + multiplicado + " = " + total);
			
		}
		System.out.println();
	}
		
		
	}
}
