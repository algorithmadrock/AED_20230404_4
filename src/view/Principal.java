/*
 RESUMO		 : Classe de Simulação da fila de atendimento
 PROGRAMADORA: Luiza Felix
 DATA		 : 04/04/2023
 */

package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.filas.Fila;
import controller.Controller;

public class Principal {

	public static void main(String[] args) {
		Fila regular = new Fila(), priority = new Fila();
		int opcao = 0, atendimento = 1;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("\n1) Inserir cliente (as filas são escolhidas aleatoriamente)\n2) Atender cliente\n\n**Para SAIR digite 0."));
			switch(opcao) {
			case 1:
				int fila = (int) (Math.random()*5+1);
				if (fila == 1) {
					Controller.inserir(priority, fila);
				} else {
					Controller.inserir(regular, fila);
				}
				break;
		
			case 2:
				atendimento = Controller.atender(atendimento, priority, regular);
				break;
			
			case 0:
				System.out.println("Programa finalizado com sucesso!");
				break;
			}
		} while (opcao!=0);
	}

}
