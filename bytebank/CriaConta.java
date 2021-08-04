package bytebank;

public class CriaConta {

	public static void main(String[] args) {
			
//		if(segundaConta.transfere(300, primeiraConta)) {
//			System.out.println("trasferencia com sucesso");
//			
//		}
//		else {
//			System.out.println("não tem dinheiro");
//		}
		
//		System.out.println(segundaConta.getSaldo());
//		System.out.println(primeiraConta.getSaldo());
//		System.out.println("total de contas:" + Conta.getTotal());
		
		ControleBonificacao controle = new ControleBonificacao();
		
		Gerente g1 = new Gerente();
		g1.setSalario(2000);
		Programador p1 = new Programador();
		p1.setSalario(1000);
		
		
		controle.somaBonificacao(g1);
		controle.somaBonificacao(p1);
		
		System.out.println(controle.getSoma());
		
		
		ContaCorrente cc = new ContaCorrente(200,222);
		ContaPoupanca cp = new ContaPoupanca(300,333);
		
		cc.deposita(100);
		cp.deposita(200);
		
		cc.saca(1);
		cc.transfere(1, cp);
		
//		System.out.println(cc.getSaldo());
		
		Administrador adm = new Administrador();
		
		g1.setSenha(11);
		adm.setSenha(22);
		
		g1.autentica(11);
		adm.autentica(22);
		
		}
	
	
}
