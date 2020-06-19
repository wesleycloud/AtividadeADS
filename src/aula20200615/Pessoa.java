package aula20200615;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
private String sobrenome;
private String dataNacimento;
private String nome;
private List<Endereco> enderecos = new ArrayList<Endereco>();

public String getSobrenome() {
	return sobrenome;
}
public String getDataNacimento() {
	return dataNacimento;
}
public String getNome() {
	return nome;
}

public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}
public void setDataNacimento(String dataNacimento) {
	this.dataNacimento = dataNacimento;
}
public void setNome(String nome) {
	this.nome = nome;
}
public void  addEndereco(Endereco e) {
	enderecos.add(e);
}
@Override
public String toString() {
	return "Pessoa [sobrenome=" + sobrenome + ", dataNacimento=" + dataNacimento + ", nome=" + nome + ", enderecos="
			+ enderecos + "]";
}


	
}
