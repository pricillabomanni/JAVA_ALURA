public class ControleBonificacao {

	private double soma;

	public void registra(Funcionario f) {
		//esse metodo do getBonificacao será chamado o especifico de cada objetivo refereciado;
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}

	public double getSoma() {
		System.out.println("Soma funcionario ");
		return soma;
	}

}
