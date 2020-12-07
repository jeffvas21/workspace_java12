package userinterface;

import model.CartaoCashBack;
import model.CartaoPrePago;

public class Evento {
	public static void main(String[] args) {
		
		CartaoPrePago cpp = new CartaoPrePago("12345678","Professor Isidro", 2023, 10);
		CartaoPrePago cb1 = new CartaoCashBack("12345677", "CashBack 1", 2023, 10, 0);
		CartaoPrePago cb2 = new CartaoCashBack("12345688", "CashBack 2", 2023, 10, 1);
		CartaoPrePago cb3 = new CartaoCashBack("12345699", "CashBack 3", 2023, 10, 2);
		
		cpp.adicionarCredito(1000);
		cb1.adicionarCredito(1000);
		cb2.adicionarCredito(1000);
		cb3.adicionarCredito(1000);
		System.out.println(cpp);
		System.out.println(cb1);
		System.out.println(cb2);
		System.out.println(cb3);
		
		cpp.comprar(100);
		cb1.comprar(100);
		cb2.comprar(100);
		cb3.comprar(100);
		
		System.out.println("\n------------------\n");
		
		System.out.println(cpp);
		System.out.println(cb1);
		System.out.println(cb2);
		System.out.println(cb3);
	}

}
