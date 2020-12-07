package userinterface;

import model.CartaoCashBack;
import model.CartaoPrePago;

public class Evento {
	public static void main(String[] args) {
		
		// a notação [] indica agora que a variável cartões não armazena mais um único objeto,
		// e sim um conjunto de objetos
		
		// todo conjunto (vetor/array) é uma coleção de tamanho fixo e não redimensionável, que armazena
		// um número finito de valores. Cada valor é acessado através de uma posição (que sempre inicia em 0)
		
		CartaoPrePago cartoes[];  // declarei meu conjunto
		cartoes = new CartaoPrePago[5]; // aqui eu defino que o meu vetor CARTOES tem tamanho 5
		                                // o que significa isso? que posso apontar para 5 objetos diferentes
		
		// esta declaracao acima equivale a substituir 5 declarações de variáveis do tipo CartaoPrePago
		
		// agora, mais do que nunca, preciso dos objetos
		// a notação [0] indica que estou acessando a posição 0 do vetor, e assim por diante
		cartoes[0] = new CartaoPrePago ("11112222","Cliente PP1", 2030, 10);
		cartoes[1] = new CartaoCashBack("22223333","Cliente CB1", 2030, 10, 0);
		cartoes[2] = new CartaoCashBack("22224444","Cliente CB2", 2030, 10, 1);
		cartoes[3] = new CartaoCashBack("22225555","Cliente CB3", 2030, 10, 2);
		cartoes[4] = new CartaoPrePago ("11113333","Cliente PP2", 2030, 10);
		
		for (int pos=0; pos < 5; pos++) {
			cartoes[pos].adicionarCredito(1000);
			System.out.println("Adicionando R$ 1000,00 de crédito no cartao "+cartoes[pos].getNumCartao());
		}
		
		for (int pos=0; pos<cartoes.length; pos++) {
			if (cartoes[pos].comprar(100.00)) {
				System.out.println("Compra aprovada no cartao "+cartoes[pos].getNumCartao());
			}
			else {
				System.out.println("Compra nao autorizada no cartao "+cartoes[pos].getNumCartao());
			}
		}
		
		 
		for (int pos=0; pos < cartoes.length; pos++) {
			System.out.println(cartoes[pos]);
		}
		
		
		
		
		
		
		
	}

}
