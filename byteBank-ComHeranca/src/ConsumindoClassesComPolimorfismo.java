
public class ConsumindoClassesComPolimorfismo {

	public static void main(String[] args) {

		Gerente g = new Gerente();
		g.setNome("Prig");
		g.setSalario(6000.0);

		Funcionario f = new EditorDeVideo();
		f.setNome("Pri2f");
		f.setSalario(2000.0);

		EditorDeVideo ev = new EditorDeVideo();
		f.setNome("Pri3ev");
		f.setSalario(3000.0);

		ControleBonificacao controle = new ControleBonificacao();

		controle.registra(g);
		controle.registra(f);
		controle.registra(ev);

		System.out.println(controle.getSoma());

	}

}
