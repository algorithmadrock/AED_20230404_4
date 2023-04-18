/*
 RESUMO		 : Anota��es das estruturas de fila construidas em aula.
 PROGRAMADORA: Luiza Felix
 DATA		 : 04/04/2023
 */

package controller;

import br.edu.fateczl.filas.Fila;
import model.Cliente;

public class Controller {
	
	public static void inserir(Fila fila, int tipo) {
		Cliente cliente = new Cliente("#CL");
		fila.insert(cliente);
		
		if (tipo == 1) {
			System.out.println(cliente.nome + cliente.numero + " entrou na fila prioritária.");
		} else {
			System.out.println(cliente.nome + cliente.numero + " entrou na fila regular.");
		}
		
		
	}
	
	public static int atender(int atendimento, Fila priority, Fila regular) {
		Cliente cliente = new Cliente();
			if(!priority.vazia() && atendimento <= 3 ) {
				atendimento ++;
				try {
					cliente = (Cliente) priority.remove();
					System.out.println(cliente.nome + cliente.numero + " está sendo atendido.");
				} catch (Exception e) {
				}	
				
			} else {
				atendimento = 0;
				try {
					cliente = (Cliente) regular.remove();
					System.out.println(cliente.nome + cliente.numero + " está sendo atendido.");
				} catch (Exception e) {
					System.err.println("Não há clientes.");
				}
				
			}
		return atendimento;
		
	}

}
