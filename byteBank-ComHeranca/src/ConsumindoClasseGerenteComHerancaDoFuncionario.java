
public class ConsumindoClasseGerenteComHerancaDoFuncionario {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Pri");
		g1.setCpf("123.456.787-0");
		g1.setSalario(8500.90);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(3434);
		boolean verificacao = g1.autenticar(3434);
		System.out.println(verificacao);
		
		System.out.println(g1.getBonificacao());

	}

}
