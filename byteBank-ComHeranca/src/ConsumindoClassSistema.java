
public class ConsumindoClassSistema {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setSenha(2222);

		SistemaInterno sistema = new SistemaInterno();

		sistema.autentica(gerente);
		
	}
}
