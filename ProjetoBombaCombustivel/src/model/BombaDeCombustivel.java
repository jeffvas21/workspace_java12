package model;

public class BombaDeCombustivel {
	private String nomeCombustivel;
	private double precoLitro;
	private double qtdLitros;
	private double totalPagar;
	
	public BombaDeCombustivel(String nome, double preco) {
		this.nomeCombustivel = nome;
		this.precoLitro = preco;
		this.qtdLitros = 0;
		this.totalPagar = 0;
	}
	
	public BombaDeCombustivel(String nome) {
		this.nomeCombustivel = nome;
		this.precoLitro = 0.0;
		this.qtdLitros = 0.0;
		this.totalPagar = 0.0;
	}
	
	public void abastecerPorLitros(double qtdLitros) {
		this.qtdLitros = qtdLitros;
		this.totalPagar = this.qtdLitros * this.precoLitro;
	}
	
	public void abastecerPorValor(double valor) {
		this.totalPagar = valor;
		this.qtdLitros = this.totalPagar / this.precoLitro;
	}
	
	public String exibirRecibo() {
		String recibo = "==========================================\n"+
	                    " I S I D R O C O R P - Gas & Energy       \n"+
				        "------------------------------------------\n"+
	                    " Recibo de Pagamento \n"+
				        " Combustivel: "+nomeCombustivel+"\n"+
	                    " Preço do Litro   R$ "+String.format("%.3f",this.precoLitro)+"\n"+
				        " Litros Abastecidos: "+String.format("%.3f",this.qtdLitros) +"\n"+
	                    " Total a Pagar    R$ "+String.format("%.2f",this.totalPagar)+"\n"+
				        "==========================================";
		return recibo;		        
	}
	
	public String getNomeCombustivel() {
		return nomeCombustivel;
	}
	public void setNomeCombustivel(String nomeCombustivel) {
		this.nomeCombustivel = nomeCombustivel;
	}
	public double getPrecoLitro() {
		return precoLitro;
	}
	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}
	public double getQtdLitros() {
		return qtdLitros;
	}
	public void setQtdLitros(double qtdLitros) {
		this.qtdLitros = qtdLitros;
	}
	public double getTotalPagar() {
		return totalPagar;
	}
	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}
	
	

}
