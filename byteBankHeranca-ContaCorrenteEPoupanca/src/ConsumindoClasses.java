
public class ConsumindoClasses {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(44, 34);
		cc.deposita(800.0);

		ContaPoupanca cp = new ContaPoupanca(55, 88);
		cp.deposita(500.0);

		cc.transfere(400, cp);
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

	}

}
