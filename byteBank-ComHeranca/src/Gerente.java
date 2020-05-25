//Gerente é um Funcionario, ele pode fazer uso dos atributos da classe funcionario;
public class Gerente extends Funcionario {

	private int senha;

	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autenticar(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}
