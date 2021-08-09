package bytebank;

public class Cliente implements Autenticavel {

	private AutenticavelUtil util;
	
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
