package br.com.fiap.implementacao;
import br.com.fiap.beans.Endereco;
import br.com.fiap.lib.Magica;

import br.com.fiap.beans.Professor;

public class TesteProfessor {

	public static void main(String[] args) {
		Professor professor = new Professor(
				Magica.s("Nome"),
				Magica.s("Formação"),
				Magica.f("Salario"),
				new Endereco(
				Magica.s("Logradouro"),
				Magica.s("Numero"),
				Magica.s("Complemento"),
				Magica.s("Bairro"),
				Magica.s("Cidade"),
				Magica.s("UF"),
				Magica.s("Cep")						
						
						)
				
				
				);

	}

}
