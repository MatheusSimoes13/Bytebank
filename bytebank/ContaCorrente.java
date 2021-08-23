package bytebank;

public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia,int numero) {
		super(agencia,numero);
	}
	
	@Override
	public void saca(double valor) {
		double taxaSaque = valor + 0.2;
		super.saca(taxaSaque);
	}

	@Override
	public double getValorImposto() {
		double impostoCC = super.getSaldo() * 0.01;
		return impostoCC;
	}
	
}
