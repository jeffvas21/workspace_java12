package model;

public class Professor extends Pessoa {
	private String disciplina;
	private String area;
	
	
	public String exibirInfo() {
		String res = "PROFESSOR: "+nome+" / "+email + " ( "+telefone+") "+area+"/"+disciplina;
		return res;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	

}
