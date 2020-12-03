
public class LojaVirtual {
	public static void main(String[] args) {
		Produto p1, p2, p3;
		
		p1 = new Produto();
		p2 = new Produto();
		p3 = new Produto();
		
		/* este trecho de código é para preencher os atributos de cada um dos objetos */
		p1.setCodBarras(987654);
		p1.setNome("Computador top de linha com luzinha");
		p1.setPreco(2500.00);
		p1.setDepartamento("Informatica");
		
		p2.setCodBarras(789654);
		p2.setNome("Mouse que pisca");
		p2.setPreco(100.00);
		p2.setDepartamento("Informatica");
		
		p3.setCodBarras(789123);
		p3.setNome("Cadeira gamer que da dor nas costas");
		p3.setPreco(1200.00);
		p3.setDepartamento("Moveis de Escritorio");
		
		System.out.println(p1.exibirProduto());
		System.out.println("   O PATRAO FICOU LOUCO!!! R$ "+p1.aplicarDesconto(25));
		System.out.println(p2.exibirProduto());
		System.out.println("   NEGOCIO DA CHINA!!! R$ "+p2.aplicarDesconto(12));
		System.out.println(p3.exibirProduto());
		System.out.println("   PRA ACABAR HOJEEEE!!! R$ "+p3.aplicarDesconto(20));
	}

}
