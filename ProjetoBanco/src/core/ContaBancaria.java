package core;


public class ContaBancaria {
	private int    numConta;
	private String nomeTitular;
	private String cpf;
	private double saldo;
	
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public boolean sacar(double valor) {
		if (saldo >= valor) {
			// atualizo o saldo
			saldo = saldo - valor;
			return true;   // saque foi autorizado
		}
		else {
			return false;
		}
		
	}
	
	public String exibirDados() {
		String res = "Conta "+numConta+" Titular: "+nomeTitular+" ("+cpf+") R$ "+String.format("%.2f",saldo);
		return res;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
}
