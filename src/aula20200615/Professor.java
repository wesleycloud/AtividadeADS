package aula20200615;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
	private int chaveProfessor;

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public Professor(int chaveProfessor) {
		super();
		this.chaveProfessor = chaveProfessor;
	}

	public void addDisciplina(Disciplina d) {
		disciplinas.add(d);

	}

	public int getChaveProfessor() {
		return chaveProfessor;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

}
