/* quando eu declaro uma classe, na verdade eu estou declarando
 * um novo tipo de dado (estrutura)
 * 
 * Neste caso, o tipo de dado CARRO contém propriedades (atributos)
 * que são, sua marca, seu modelo, seu ano, sua cor e seu preço
 */
public class Carro {
	String marca;
	String modelo;
	int    ano;
	String cor;
	double preco;
	
	void imprimir(){
		System.out.println("---- CARRO -----");
		System.out.println("Marca: "+marca+"/"+modelo);
		System.out.println("Ano : "+ano+"   Cor: "+cor);
		System.out.println("Preço: R$ "+preco);
	}
	
	
	/*
	 *  todo método é um trecho de código
	 *  como todo trecho de código, ele segue também o padrão E -> P -> S
	 *  
	 *  a declaração do método é feita da seguinte forma:
	 *  
	 *  tipoSaida   nomeMetodo ( lista de parâmetros de entrada) {
	 *     ... lógica (processamento)
	 *  }
	 */
	double calcularIPVA(){
		if (ano < 2000) {
			return 0;
		}
		else {
			return preco * 0.04;
		}
	}
	
	
	
}
