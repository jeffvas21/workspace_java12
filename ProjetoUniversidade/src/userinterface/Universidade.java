package userinterface;

import model.Estudante;
import model.Pessoa;
import model.Professor;

public class Universidade {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p = new Pessoa();
		p.setTelefone("912345678");
		p.setEmail("pessoa@gente.com");
		p.setNome("Pessoa");
		
		Estudante e1 = new Estudante();
		
		e1.setNome("Isidro");
		e1.setEmail("isidro@isidro.com");
		e1.setTelefone("987654321");
		e1.setNumMatricula(1234);
		e1.setCurso("Computacao");
		
		System.out.println(e1.exibirInfo());
		
		Professor pro = new Professor();
		pro.setNome("Jose");
		pro.setEmail("jose@prof.com");
		pro.setTelefone("987651234");
		pro.setArea("Exatas");
		pro.setDisciplina("Programacao");
		System.out.println(pro.exibirInfo());
		 
		
	}
	
	

}
