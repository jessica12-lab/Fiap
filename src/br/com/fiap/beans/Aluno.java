package br.com.fiap.beans;

public class Aluno {


private int rm;
private String nome;
private String email;
private String fone;
private Endereco endereco;
public Aluno(int rm, String nome, String email, String fone, Endereco endereco) {
	super();
	this.rm = rm;
	this.nome = nome;
	this.email = email;
	this.fone = fone;
	this.endereco = endereco;
}

public Aluno() {
	super();
}

public int getRm() {
	return rm;
}

public void setRm(int rm) {
	this.rm = rm;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getFone() {
	return fone;
}

public void setFone(String fone) {
	this.fone = fone;
}

public Endereco getEndereco() {
	return endereco;
}

public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
}


public void setAll(int rm, String nome, String email, String fone, Endereco endereco) {
	this.rm = rm;
	this.nome = nome;
	this.email = email;
	this.fone = fone;
	this.endereco = endereco;
}

@Override
public String toString() {
	return "Aluno [rm=" + rm + ", nome=" + nome + ", email=" + email + ", fone=" + fone + ", endereco=" + endereco
			+ "]";
}
}




