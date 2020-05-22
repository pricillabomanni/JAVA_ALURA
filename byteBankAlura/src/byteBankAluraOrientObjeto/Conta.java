package byteBankAluraOrientObjeto;

public class Conta {
	public double saldo;
	public int agencia;
	public int numero;
	public String titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque feito com sucesso!");
			return true;
		}else {
			System.out.println("Saque não realizado!");
			return false;
		}
	}
	public void transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			System.out.println("Transferencia feita com sucesso!");
		}else {
			System.out.println("Saldo insuficiente!");
		}
	}
}