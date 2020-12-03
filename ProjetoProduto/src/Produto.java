
public class Produto {
	private int    codBarras;
	private String nome;
	private double preco;
	private String departamento;
	
	// já que meus atributos estão "blindados" (encapsulados), precisamos de mecanismos para 
	// acessar
	
	// isso implica em uma funcionalidade (método) para modificar seu valor e outro método para consultar seu valor
	public int getCodBarras() {
		return this.codBarras;
	}

	public void setCodBarras(int codBarras) {
		this.codBarras = codBarras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String exibirProduto() {
		String resultado = "PRODUTO "+nome+" ("+codBarras+") \nDepto: "+departamento+" R$ "+preco;
		return resultado;
	}
	

	public double aplicarDesconto(double percentual) {
		return preco - preco*percentual/100;
	}

}
