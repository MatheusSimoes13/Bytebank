package bytebank;

public class ControleBonificacao {

	//Classe para ver qual � a bonifica��o total de todos os funcionarios somados
	//Polimorfismo top
	
	
	private double soma;
	
	public double somaBonificacao(Funcionario f) {
		double boni = f.getBonificacao();
		return this.soma = this.soma + boni;
	}

	
	public double getSoma() {
		return this.soma;
	}
}
