package model;

public class Conta {
	protected int numConta;
	protected String nomeTitular;
	protected String cpfTitular;
	protected double saldo;
	
	public Conta(int numConta, String nomeTitular, String cpfTitular, double saldo) {
		
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpfTitular;
		this.saldo = saldo;
	}

	public void creditar(double valor) {
		this.saldo += valor;
	}
	
	public boolean debitar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "Conta: " + numConta + " / " + nomeTitular + " (" + cpfTitular + ")  R$ " + String.format("%.2f", saldo);
	}
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getCpfTitular() {
		return cpfTitular;
	}
	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	
	

}
