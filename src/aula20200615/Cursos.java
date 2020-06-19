package aula20200615;

import java.util.ArrayList;
import java.util.List;

public class Cursos {
	private String descricao;
	private int chavecurso;

	private Coordenadores coordenador;
	
	private List<Turma> turmas = new ArrayList<>();
	private List<Disciplina> diciplinas = new ArrayList<>();

	public Cursos(String descricao, int chavecurso, Coordenadores coordenador) {
		super();
		this.descricao = descricao;
		this.chavecurso = chavecurso;
		this.coordenador = coordenador;
	}

}
