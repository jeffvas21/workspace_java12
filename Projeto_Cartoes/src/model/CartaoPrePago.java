package model;

public class CartaoPrePago {

	protected String numCartao;
	protected String nomeTitular;
	protected int    anoValidade;
	protected int    mesValidade;
	protected double saldo;
	
	
	public CartaoPrePago(String numCartao, String nomeTitular, int anoValidade, int mesValidade) {
		super();
		this.numCartao   = numCartao;
		this.nomeTitular = nomeTitular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo       = 0.0;
	}
	
	public void adicionarCredito(double valor) {
		this.saldo += valor;
	}
	
	public boolean comprar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "CartaoPrePago [numCartao=" + numCartao + ", nomeTitular=" + nomeTitular + ", anoValidade=" + anoValidade
				+ ", mesValidade=" + mesValidade + ", saldo=" + String.format("%.2f", saldo) + "]";
	}

	public String getNumCartao() {
		return numCartao;
	}
	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public int getAnoValidade() {
		return anoValidade;
	}
	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}
	public int getMesValidade() {
		return mesValidade;
	}
	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
}
