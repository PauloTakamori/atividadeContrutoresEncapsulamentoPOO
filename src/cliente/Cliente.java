package cliente;

public class Cliente {
	private int numeroCC;
	private String nomeUsuario;
	private double saldo;
			
	public Cliente(int numeroCC, String nomeUsuario) {
		this.numeroCC = numeroCC;
		this.nomeUsuario = nomeUsuario;
	}
	
	public Cliente(int numeroCC, String nomeUsuario, double depositoInicial) {
		this.numeroCC = numeroCC;
		this.nomeUsuario = nomeUsuario;
		deposito(depositoInicial);
	}

	public int getNumeroCC() {
		return numeroCC;
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double quantia) {
		saldo += quantia;
	}

	public void saque(double quantia) {
		saldo -= quantia + 5.0;
	}
	
		
	public String toString() {
		return "Conta CC:" 
	+ numeroCC 
	+ ", Nome Usúario: " 
	+ nomeUsuario 
	+ " saldo: R$" 
	+ String.format("%.2f", saldo);
	}
	
}
