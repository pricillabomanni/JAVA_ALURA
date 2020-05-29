
public class ConsumindoClasseFuncionario {

	public static void main(String[] args) {
		
		Funcionario pricilla = new Gerente();
		pricilla.setNome("Pricilla Bomanni");
		pricilla.setCpf("234.456.789-90");
		pricilla.setSalario(8000);
		
		System.out.println(pricilla.getNome());
		System.out.println(pricilla.getCpf());
		System.out.println(pricilla.getBonificacao());

	}

}
