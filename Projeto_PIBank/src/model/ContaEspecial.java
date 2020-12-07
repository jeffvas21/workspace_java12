package model;

public class ContaEspecial extends Conta{
	private double limite;

	public ContaEspecial(int numConta, String nomeTitular, String cpfTitular, double saldo, double limite) {
		super(numConta, nomeTitular, cpfTitular, saldo);
		this.limite = limite;
	}

	/* é o mesmo método debitar da classe Conta?
	 * é o mesmo cabeçalho
	 * 
	 * quando tenho 2 métodos de mesmo cabeçalho em classes pai e filha, damos o nome de
	 * sobrescrita (ao invés da sobrecarga), ou seja, a classe FILHA (ContaEspecial) sobrescreve o método
	 * definido na classe Pai.
	 */
	public boolean debitar(double valor) {
		if (super.saldo + this.limite >= valor) {
			super.saldo = saldo - valor;
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "Conta Especial :"+super.numConta +" / " +super.nomeTitular+" (" + 
	            super.cpfTitular+") R$ "+String.format("%.2f", super.saldo) +"  Limite R$ "+
				String.format("%.2f",this.limite) + "  Valor disponível "+ String.format("%.2f", saldo+limite);
	}
	
	

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	

}
