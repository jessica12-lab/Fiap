package br.com.fiap.implementacao;

import br.com.fiap.beans.Aluno;
import br.com.fiap.beans.Endereco;

public class Implementacao {

	public static void main(String[] args) {
		Aluno objeto = new Aluno();
		objeto.setEmail("nike-jessica@");
		objeto.setFone("22");
		objeto.setNome("jessi");
		objeto.setRm(12);
		
		System.out.println(objeto.getEmail());
		System.out.println(objeto.getFone());
		System.out.println(objeto.getNome());
		System.out.println(objeto.getRm());
		
		Endereco endereco = new Endereco();
		endereco.setAll("alameda santo", "26", "ap 26", "itaquera", "sao paulo", "sp", "0265203");
		Aluno objeto2 = new Aluno();
objeto2.setAll(456, "4521", "jessica@cs", "45455", endereco);				
		
		System.out.println(objeto2.toString());
		

	}

}
