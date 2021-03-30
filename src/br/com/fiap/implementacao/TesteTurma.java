package br.com.fiap.implementacao;
import br.com.fiap.beans.Professor;
import br.com.fiap.beans.Turma;
import br.com.fiap.beans.Aluno;
import br.com.fiap.lib.Magica;
import br.com.fiap.beans.Curso;
import br.com.fiap.beans.Endereco;
public class TesteTurma {

	public static void main(String[] args) {
    Turma turma = new Turma(
    		Magica.i("id"),
    		Magica.s("Sigla"),
    		Magica.s("m"),
           new Curso(
        		   2,
        		   "desc",
        		   200,
        		   5000,
        		   "especializaçao"
        		   ),
           new Aluno(
        		   23,
        		 Magica.s("nome"),
        		 Magica.s("email"),
        		 Magica.s("fone"), 
        		 new Endereco(
        				 Magica.s("Logradouro"),
        					Magica.s("Numero"),
        					Magica.s("Complemento"),
        					Magica.s("Bairro"),
        					Magica.s("Cidade"),
        					Magica.s("UF"),
        					Magica.s("Cep")	)
        		   ),
          
    	   new Professor(
    			   
    			   Magica.s("nome"),
    			   Magica.s("Formacao"),
    			   Magica.f("salario"),
    	new Endereco(
    			Magica.s("Logradouro"),
				Magica.s("Numero"),
				Magica.s("Complemento"),
				Magica.s("Bairro"),
				Magica.s("Cidade"),
				Magica.s("UF"),
				Magica.s("Cep")	   
    			   
    			   
    			   )
    	)
    	   
    
    		
    		);
    		System.out.println("Nome do professor: " + turma.getProfessor().getNome());
    		System.out.println("Nome do professor: " + turma.getAluno().getNome());
    		System.out.println("log do aluno: " + turma.getAluno().getEndereco().getLogradouro());
    		System.out.println("Desc do curso: " + turma.getCurso().getDescricao());
    		System.out.println("Valor do curso: " + turma.getCurso().getValor());
    	
    
    
	
	
	}

}
