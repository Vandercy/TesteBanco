package br.umc.iod.rmi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;

/**
 *
 * @author marciomendes
 */
public class Message implements Serializable{
    String texto;
    long id;
    int numero;

    public Message() {
    }

    public Message(long id; String texto; int numero);
        this.id= id;
        this.texto = texto;
        this.numero = numero;
       
    }

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

    
    
    
    
    
}
