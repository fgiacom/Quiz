package br.edu.ifes.sr.poo2.api.model;

import java.util.HashSet;
import java.util.Set;


public class Jogador extends Usuario {

	private static final long serialVersionUID = 1L;


	private String username;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
