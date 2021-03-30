package br.com.fiap.implementacao;

import br.com.fiap.beans.Aluno;
import br.com.fiap.beans.Endereco;
import br.com.fiap.lib.Magica;

public class AlunoImplementacao {

	public static void main(String[] args) {
		
            Aluno objeto = new Aluno(               
            		Magica.i("RM"),
            		Magica.s("Nome"),
            		Magica.s("Email"),
            		Magica.s("Fone"),
            		
            		new Endereco(
            				Magica.s("Logradouro"),
            				Magica.s(" Numero"),
            				Magica.s("Bairro"),
            				Magica.s("Cidade"),
            				Magica.s("Estado"),
            				Magica.s("UF"),
            				Magica.s("País")
            				
            				)
            		
            		);
            
        System.out.println(objeto.toString());
        System.out.println(objeto.getEndereco().getBairro());
					
            		
            		
            		
	}

}
