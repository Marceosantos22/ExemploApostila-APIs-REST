
package com.api.tarefas.model;

import org.springframework.stereotype.Component;

/**
 * @author Marcelo Oliveira
 */

@Component
public class Tarefa {
	
	//Declaração dos atributos:
	private int id;
	private String descricao;
	private boolean completa;
	
	
	//Construtores
	public Tarefa(){}

	public Tarefa(int id, String descricao, boolean completa) {
		this.id = id;
		this.descricao = descricao;
		this.completa = completa;
	}
	
	//Métodos Getters e Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isCompleta() {
		return completa;
	}

	public void setCompleta(boolean completa) {
		this.completa = completa;
	}
	
	
}
