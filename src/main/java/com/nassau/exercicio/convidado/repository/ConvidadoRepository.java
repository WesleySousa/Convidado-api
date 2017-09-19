package com.nassau.exercicio.convidado.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.nassau.exercicio.convidado.model.Convidado;

public class ConvidadoRepository {
	
	
	private static List<Convidado> convidados;
	
	static {
		convidados = new ArrayList<>();
		convidados.add(new Convidado("Wesley", 3));
		convidados.add(new Convidado("Rodrigo", 4));
		convidados.add(new Convidado("Marcelo", 8));
		convidados.add(new Convidado("Livia", 2));
		convidados.add(new Convidado("Jardel", 4));
	}
	
	
	public static List<Convidado> pesquisar(String nome){
		return convidados.stream().filter((c) -> c.getNome().toLowerCase().contains(nome.toLowerCase())).collect(Collectors.toList());
	}

}
