package br.com.fiap.implementacao;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Curso;

public class ImplementacaoCurso {

	public static void main(String[] args) {
	 Curso curso = new Curso(
			 
			 Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo")),
			 JOptionPane.showInputDialog("descri��o"),
			 Integer.parseInt(JOptionPane.showInputDialog("Digite a ca rga horaria")),
			 Integer.parseInt(JOptionPane.showInputDialog("Digite o valor")),
			 JOptionPane.showInputDialog("Titula��o").toUpperCase()
			 );
	 System.out.println(curso);
	 
	 
	 
	 
	 
	}

}
