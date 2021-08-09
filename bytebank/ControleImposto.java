package bytebank;

public class ControleImposto {

	private double totalImposto;
	
	public void registra(Tributavel t) {
		double somaImposto = t.getValorImposto();
		this.totalImposto = this.totalImposto + somaImposto;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
	
}
