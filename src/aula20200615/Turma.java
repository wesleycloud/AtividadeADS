package aula20200615;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	private String descricao;
	private int chavTurma;

	private Cursos curso;
	private List<Alunos> alunos = new ArrayList<>();

	public Turma(String descricao, int chavTurma, Cursos curso) {
		super();
		this.descricao = descricao;
		this.chavTurma = chavTurma;
		this.curso = curso;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getChavTurma() {
		return chavTurma;
	}

	public Cursos getCurso() {
		return curso;
	}

	public List<Alunos> getAlunos() {
		return alunos;
	}

	public void addAlunos(Alunos a) {

		alunos.add(a);
		
	}

}
