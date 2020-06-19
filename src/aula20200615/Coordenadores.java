package aula20200615;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Pessoa {

	private int chaveCoordenador;

	private List<Cursos> cursos = new ArrayList<Cursos>();

	public Coordenadores(int chaveCoordenador) {
		this.chaveCoordenador = chaveCoordenador;
	}

	public int getChaveCoordenador() {
		return chaveCoordenador;
	}

	public List<Cursos> getCursos() {
		return cursos;
	}

	public void addCurso(Cursos c) {
		cursos.add(c);
	}
}
