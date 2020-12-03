
public class IsiCarrosLoja {
	public static void main(String[] args) {
		
		// eu estou declarando variáveis do tipo Carro
		Carro c1, c2, c3;
		FabricaDeCarros f1;
		f1 = new FabricaDeCarros();
		
		// aqui efetivamente eu peço memória pra JVM pra poder armazenar os dados
		c1 = new Carro();
		c2 = new Carro();
		
		c1.marca  = "Porche";
		c1.modelo = "Kaieny";
		c1.cor    = "Azul Marinho nervoso";
		c1.ano    = 2020;
		c1.preco  = 1250000.00;
		
		c2.marca  = "Xevrolé";
		c2.modelo = "Córsa";
		c2.cor    = "Prata com detalhes brancos";
		c2.ano    = 1998;
		c2.preco  = 3852.00;
		
		c1.imprimir();
		double ipvaC1 = c1.calcularIPVA();
		
		System.out.println("Valor do IPVA para este carro = "+ipvaC1);
		
		
		c3 = f1.fabricarUmCarroNovo("Azul Geladeira da vó");
		c3.imprimir();
	}
}
