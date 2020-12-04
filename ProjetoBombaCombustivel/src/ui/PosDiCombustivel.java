package ui;

import model.BombaDeCombustivel;

public class PosDiCombustivel {
	public static void main(String[] args) {
		
		BombaDeCombustivel b1;
		BombaDeCombustivel b2;
		
		b2 = new BombaDeCombustivel("Diesel S10");
		
		b1 = new BombaDeCombustivel("Gasolina Comum", 4.19 );
//		b1.setNomeCombustivel("Gasolina Comum");
//		b1.setPrecoLitro(4.19);
		
		b1.abastecerPorLitros(50.00);
		System.out.println(b1.exibirRecibo());
		
		System.out.println("\n");
		
		b1.abastecerPorValor(30.00);
		System.out.println(b1.exibirRecibo());
	}

}
