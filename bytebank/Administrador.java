package bytebank;

public class Administrador extends Funcionario implements Autenticavel {
	
	private AutenticavelUtil util;
	
	@Override
	public double getBonificacao() {
		return super.getSalario() + 200;
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
