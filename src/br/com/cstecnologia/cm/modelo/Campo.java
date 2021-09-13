package br.com.cstecnologia.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {
	
	private final int coluna;
	private final int linha;
	
	
	private boolean aberto;
	private boolean marcado;
	private boolean minado;
	
	private List<Campo> vizinhos = new ArrayList<>();
	
	Campo(int coluna, int linha){
		this.linha = linha;
		this.coluna = coluna;
		
	}
	

}
