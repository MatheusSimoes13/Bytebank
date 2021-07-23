package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta(1334, 121212);
		primeiraConta.deposita(200);
		System.out.println(primeiraConta.getSaldo());
		
		boolean conseguiuRetirar = primeiraConta.saca(50);
		System.out.println(conseguiuRetirar);
		
		Conta segundaConta = new Conta(1337, 121212);
		segundaConta.deposita(1000);
		
		if(segundaConta.transfere(300, primeiraConta)) {
			System.out.println("trasferencia com sucesso");
			
		}
		else {
			System.out.println("não tem dinheiro");
		}
		
		System.out.println(segundaConta.getSaldo());
		System.out.println(primeiraConta.getSaldo());
		System.out.println("total de contas:" + Conta.getTotal());
	}

}
