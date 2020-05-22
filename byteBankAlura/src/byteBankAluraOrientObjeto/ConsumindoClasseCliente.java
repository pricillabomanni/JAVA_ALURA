package byteBankAluraOrientObjeto;

public class ConsumindoClasseCliente {

	public static void main(String[] args) {
		
		Cliente pricilla = new Cliente();
		
		pricilla.nome="Pricilla Bomanni";
		pricilla.cpf = "123.234.345-45";
		pricilla.profissao = "Programadora";
		
		Conta contaDaPri = new Conta();
		contaDaPri.deposita(200);
		
		//associação da contaDaPri com o titular pricilla;
		contaDaPri.titular = pricilla;
				
		System.out.println(contaDaPri.titular.nome);
		System.out.println(contaDaPri.titular.profissao);
		System.out.println(contaDaPri.titular.cpf);
		System.out.println(contaDaPri.saldo);

	}

}
