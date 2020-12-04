package userinterface;
import core.ContaBancaria;
import javax.swing.JOptionPane;
public class BancoIsiTau {
	public static void main(String[] args) {
		ContaBancaria c1;
		
		c1 = new ContaBancaria();
		
		c1.setNumConta(100011);
		c1.setNomeTitular("Professor Isidro");
		c1.setCpf("123.456.789-00");
		
		//System.out.println(c1.exibirDados());
		JOptionPane.showMessageDialog(null, c1.exibirDados());
		
		c1.depositar(200.00);
		
		//System.out.println(c1.exibirDados());
		JOptionPane.showMessageDialog(null, c1.exibirDados());
		
		
		if ( c1.sacar(250.00) ) {
			JOptionPane.showMessageDialog(null, "Saque Autorizado", "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
			//System.out.println("Saque autorizado!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Saldo Indisponível", "RESULTADO", JOptionPane.ERROR_MESSAGE);
			//System.out.println("Saldo indisponível");
		}
		
		//System.out.println(c1.exibirDados());
		
	}

}
