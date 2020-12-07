package model;

public class CartaoCashBack extends CartaoPrePago {
	private int tipo; // 0 - GOLD  / 1 - SILVER / 2 - BRONZE

	public CartaoCashBack(String numCartao, String nomeTitular, int anoValidade, int mesValidade, int tipo) {
		super(numCartao, nomeTitular, anoValidade, mesValidade);
		this.tipo = tipo;
	}
	
	@Override
	public boolean comprar(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
			// aqui vem a lógica do CashBack
			if (tipo == 0) {
				super.saldo += valor * 0.08;   // recompensa do GOLD
			}
			else if (tipo == 1) {
				super.saldo += valor * 0.05;   // recompensa do SILVER
			}
			else if (tipo == 2) {
				super.saldo += valor * 0.02;   // recompensa do BRONZE
			}
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "CartaoCashBack [numCartao=" + numCartao + ", nomeTitular=" + nomeTitular + ", anoValidade="
				+ anoValidade + ", mesValidade=" + mesValidade + ", saldo=" + String.format("%.2f", saldo) + ", tipo=" + tipo + "]";
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	

}
