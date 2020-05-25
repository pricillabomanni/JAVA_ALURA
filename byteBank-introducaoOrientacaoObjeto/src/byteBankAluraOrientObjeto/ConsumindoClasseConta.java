package byteBankAluraOrientObjeto;

public class ConsumindoClasseConta {
	public static void main(String[] args) {

		Conta contaDaPri = new Conta(3,5);
		Conta conta = new Conta(222,999);
		Conta conta3 = new Conta(2,4);
		
		/*contaDaPri.saldo = 200;
		contaDaPri.deposita(200);
		System.out.println(contaDaPri.saldo);		
		contaDaPri.saca(150);
		System.out.println(contaDaPri.saldo);*/
			
		Conta contaDaMaria = new Conta(23,43);
		contaDaMaria.deposita(1000);				
		contaDaMaria.transfere(100, contaDaPri);
	
		System.out.println("Conta da Maria " + contaDaMaria.getSaldo());
		System.out.println("Conta da Pri " + contaDaPri.getSaldo());
		System.out.println("Total de contas criadas " + Conta.getTotal());
		
		


	}

}
