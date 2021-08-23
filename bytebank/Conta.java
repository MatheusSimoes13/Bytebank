package bytebank;

public abstract class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	
	public Conta (int agencia, int numero) {
		Conta.total++;
		if(agencia <= 0 ) {
			System.out.println("agencia errada");
		}
		if(numero <= 0) {
			System.out.println("numero errado");
		}
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public void deposita(double valor){
		this.saldo = this.saldo + valor;
	}
	
	public void saca(double valor) {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente para saque");
		}
		else {
			this.saldo = this.saldo - valor;
		}
			
	}
	
	public void transfere(double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);

	}
	
	public double getSaldo() {
		return this.saldo;
				}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
