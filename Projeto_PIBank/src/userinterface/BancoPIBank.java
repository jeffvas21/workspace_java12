package userinterface;

import model.Conta;
import model.ContaEspecial;

public class BancoPIBank {
	public static void main(String[] args) {
		
		Conta c1, c2;
		
		c1 = new Conta(1234, "Adalberto Ferreira", "123.456.789-00", 100.0);
		c2 = new ContaEspecial(9876, "Joao Roberto", "987.654.321-00", 100.00, 500.00);
		
		
		System.out.println(c1);
		System.out.println(c2);
		
		if (c1.debitar(150)) {
			System.out.println("Debito autorizado na conta "+c1.getNumConta());
		}
		else {
			System.out.println("Debito negado na conta "+c1.getNumConta());
		}
		
		
		if (c2.debitar(150)) {
			System.out.println("Debito autorizado na conta "+c2.getNumConta());
		}
		else {
			System.out.println("Debito negado na conta "+c2.getNumConta());
		}
	}

}
