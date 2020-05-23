package byteBankAluraOrientObjeto;

public class ConsumindoClasseCliente {

	public static void main(String[] args) {
		
		Cliente pricilla = new Cliente();
		
		pricilla.setNome("Pricilla Bomanni");
		pricilla.setCpf("123.234.345-45");
		pricilla.setProfissao("Programadora");
		
		Conta contaDaPri = new Conta(25,90);
		contaDaPri.deposita(200);
		
		//associação da contaDaPri com o titular pricilla;
		contaDaPri.setTitular(pricilla);
				
		System.out.println(contaDaPri.getTitular().getNome());
		System.out.println(contaDaPri.getTitular().getProfissao());
		System.out.println(contaDaPri.getTitular().getCpf());
		System.out.println(contaDaPri.getSaldo());

	}

}
