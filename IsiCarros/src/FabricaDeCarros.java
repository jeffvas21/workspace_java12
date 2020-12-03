
public class FabricaDeCarros {
	String nome;
	
	Carro fabricarUmCarroNovo(String corDoCarro){
		Carro novoCarro  = new Carro();
		
		novoCarro.marca  = "Voquisvaguem";
		novoCarro.modelo = "Gorzinho Bolinha";
		novoCarro.ano    = 2020;
		novoCarro.cor    = corDoCarro;
		novoCarro.preco  = 30000;
		
		return novoCarro;
		
	}

}
