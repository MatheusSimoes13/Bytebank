package bytebank;

public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticavelUtil util;
	
	public double getBonificacao() {
		return super.getSalario();
	}

	@Override
	public boolean autentica(int senha) {
		boolean autenticador = this.util.autentica(senha);
		return autenticador;

	}

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);
		
	}
}
