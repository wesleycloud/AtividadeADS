package aula20200615;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

	private int chaveDisciplina;
	private String nome;
	private List<Professor> professores = new ArrayList<>();

	public Disciplina(int chaveDisciplina, String nome) {
		super();
		this.chaveDisciplina = chaveDisciplina;
		this.nome = nome;
	}

	public int getChaveDisciplina() {
		return chaveDisciplina;
	}

	public String getNome() {
		return nome;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void addProfessor(Professor p) {
		professores.add(p);
	}

}
