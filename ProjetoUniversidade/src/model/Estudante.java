package model;

// o operador EXTENDS pode ser lido como: A classe ESTUDANTE possui TUDO O QUE TEM NA CLASSE PESSO
// mais as suas informações específicas

public class Estudante extends Pessoa {
	private String curso;
	private int    numMatricula;
	
	public String exibirInfo() {
		String resultado = "Nome: "+nome+ "/"+email+" ("+telefone+") - "+curso+" ["+ numMatricula+"]";
		return resultado;
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getNumMatricula() {
		return numMatricula;
	}
	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	
	
}
