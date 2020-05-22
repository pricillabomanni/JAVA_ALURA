package byteBankAluraOrientObjeto;

public class ConsumindoClasseConta {
	public static void main(String[] args) {

		Conta contaDaPri = new Conta();
		
		/*contaDaPri.saldo = 200;
		contaDaPri.deposita(200);
		System.out.println(contaDaPri.saldo);		
		contaDaPri.saca(150);
		System.out.println(contaDaPri.saldo);*/
		
		Conta contaDaMaria = new Conta();
		contaDaMaria.deposita(1000);
		
		contaDaMaria.transfere(400, contaDaPri);
		System.out.println("Conta Maria " + contaDaMaria.saldo);
		System.out.println("Conta Pri " + contaDaPri.saldo);


	}

}
