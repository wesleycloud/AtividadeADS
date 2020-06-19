package aula20200615;

public  class Endereco {
private String bairro;
private int numero;
private String cidade;
private String logradouro;
private String estado;
private String complemento;
private boolean primario;

public String getBairro() {
	return bairro;
}

public int getNumero() {
	return numero;
}

public String getCidade() {
	return cidade;
}

public String getLogradouro() {
	return logradouro;
}

public String getEstado() {
	return estado;
}

public String getComplemento() {
	return complemento;
}
public boolean getPrimario() {
	return primario;
}

public Endereco(String bairro, int numero, String cidade, String logradouro, String estado, String complemento, boolean primario) {
	super();
	this.bairro = bairro;
	this.numero = numero;
	this.cidade = cidade;
	this.logradouro = logradouro;
	this.estado = estado;
	this.complemento = complemento;
	this.primario = primario;
}

	
}
