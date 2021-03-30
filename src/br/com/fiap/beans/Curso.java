package br.com.fiap.beans;

public class Curso {
	private int id;
	private String descricao;
	private int cargaHoraria;
	private float valor;
	private String titulacao;
	public int getId() {
		return id;
	}
	
	public Curso(int id, String descricao, int cargaHoraria, float valor, String titulacao) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
		this.titulacao = titulacao;
	}
	public Curso() {
		super();
	}

	public String toString() {
		return id +" - " + descricao +" - "+ cargaHoraria+" - "+ valor +" - " + titulacao;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	
	

}
