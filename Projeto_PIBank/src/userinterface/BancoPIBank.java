package userinterface;

import model.Conta;
import model.ContaEspecial;

public class BancoPIBank {
	public static void main(String[] args) {
		
		Conta c1 = new Conta(1234, "Adalberto Fonseca", "123.456.789-00", 100.0);
//		c1.setNumConta(1234);
//		c1.setNomeTitular("Adalberto Fonseca");
//		c1.setCpfTitular("123.456.789-00");
//		c1.creditar(200);
		
		System.out.println(c1);
		
		ContaEspecial c2 = new ContaEspecial(9876, "Josineidson Braga", "987.654.321-00", 100.00, 500.0);
//		c2.setNomeTitular("Josineidson Braga");
//		c2.setNumConta(9876);
//		c2.setCpfTitular("987.654.321-00");
//		c2.creditar(200);
//		c2.setLimite(500);
		
		System.out.println(c2);
		
		if (c1.debitar(100)) {
			System.out.println("Debito autorizado na conta "+c1.getNumConta());
		}
		else {
			System.out.println("Saldo insuficiente na conta "+c1.getNumConta());
		}
		
		if (c2.debitar(100)) {
			System.out.println("Debito autorizado na conta "+c2.getNumConta());
		}
		else {
			System.out.println("Saldo insuficiente na conta "+c2.getNumConta());
		}
		
		System.out.println(c1);
		System.out.println(c2);
	
		
		
		if (c2.debitar(450)) {
			System.out.println("Debito autorizado na conta "+c2.getNumConta());
		}
		else {
			System.out.println("Saldo insuficiente na conta "+c2.getNumConta());
		}
	}

}
