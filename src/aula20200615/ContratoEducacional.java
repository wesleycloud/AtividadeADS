package aula20200615;

import java.util.ArrayList;
import java.util.List;

public class ContratoEducacional {

	private int chaveContato;

	private Alunos aluno;
	private List<Avalistas> avalistas = new ArrayList<>();

	public ContratoEducacional(int chaveContrato, Avalistas a, Alunos aluno) {
		this.chaveContato = chaveContrato;
		this.avalistas.add(a);
		this.aluno = aluno;
	}

	public int getChaveContato() {
		return chaveContato;
	}

	public Alunos getAluno() {
		return aluno;
	}

	public List<Avalistas> getAvalistas() {
		return avalistas;
	}
	
	public void addAvalista(Avalistas a) {
		avalistas.add(a);
	}
}

