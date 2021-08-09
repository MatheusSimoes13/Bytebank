package bytebank;

public class AutenticavelUtil {

	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("foi");
			return true;
		}
		else {
			System.out.println("nao foi");
			return false;
		}
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
}
