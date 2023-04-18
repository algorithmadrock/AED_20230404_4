/*
 RESUMO		 : Classe do "objeto" cliente
 PROGRAMADORA: Luiza Felix
 DATA		 : 04/04/2023
 */

package model;

public class Cliente {
	public int numero = (int) (Math.random()*201 + 130);
	public String nome;
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public Cliente() {

	}

}
