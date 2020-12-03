
public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado e1 = new Empregado();
		Empregado e2 = new Empregado();
		e1.nome = "Isidro";
		e1.cargo = "Professor";
		e1.salario = 10000.00;
		
		e2.nome = "Luana";
		e2.cargo = "Personal Trainer";
		e2.salario = 50000.00;
		
	    System.out.println(" -----> Ordenado antes do aumento....");
		e1.imprimir();
		e2.imprimir();
		
		System.out.println(" -----> Aumentando salario em 15%");
		e1.aumentarSalario(15.0);
		e2.aumentarSalario(15.0);
		System.out.println(" -----> Ordenado depois do aumento....");
		e1.imprimir();
		e2.imprimir();
//		System.out.println("Mostrando so o salario = "+e1.salario);
	}
}
