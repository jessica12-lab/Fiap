package br.com.fiap.beans;
public class Professor {
	private String nome;
	private String formacao; 
	private float salario;
	private Endereco endereco;
	//String.valueOf = converte para string
	
	public String aplicarDissidio( float porcentagem ) {
		if (porcentagem > 0) {
		 salario = salario + salario * (porcentagem/100);
		}
		return "Dissidio aplicado";
	}
	public float aplicarDissidio() {
		return salario;
	}
	
	public Professor(String nome, String formacao, float salario, Endereco endereco) {
		super();
		this.nome = nome;
		this.formacao = formacao;
		this.salario = salario;
		this.endereco = endereco;
	}
	
	public Professor() {
		super();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
 	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}

