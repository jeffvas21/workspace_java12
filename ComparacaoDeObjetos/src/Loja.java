
public class Loja {
	public static void main(String[] args) {
		/*
		Produto p1 = new Produto(1, "Computador com luzinha massa", 2500.0);
		
		
		System.out.println("ORIGINAL = "+ p1.exibirInfo());
		
		Produto p2 = p1;
		
		p2.setDescricao("Computador Master Mega Blaster com luzinha");
		
		
		System.out.println("P1 = " + p1.exibirInfo());
		System.out.println("P2 = " + p2.exibirInfo());
		*/
		
		String s1 = new String("Oi, tudo bem?");
		String s2 = new String("Oi, tudo bem?");
		
		if (s1 == s2) {   // o operador == não compara conteúdos, e sim se s1 e s2 apontam para a mesma região da memória
			System.out.println("apontam para a mesma área de memoria");
		}
		else {
			System.out.println("Apontam para areas distintas na memoria");
		}
		
		if (s1.equals(s2)) {  // aqui sim eu tenho a comparação lexicográfica das strings (conteúdo)
			System.out.println("Mesmo conteúdo");
		}
		else {
			System.out.println("Conteúdos diferentes");
		}
		
		
		System.out.println("------------------------------");
		System.out.println("Mais um queise!!!");
		
		String s3 = "Isidro fala pa buné";
		String s4 = s3;    // não tenho nova string, tenho apenas s4 apontando para s3
		System.out.println(s4==s3);
		
		System.out.println("Originalmente.... ");
		System.out.println(s3);
		System.out.println(s4);
		
		s4 = "Vai acabar....";
		
		System.out.println("----------------");
		System.out.println(s3);
		System.out.println(s4);
		s4 = s4 + "ufa";
		System.out.println(s3);
		System.out.println(s4);
	}

}
