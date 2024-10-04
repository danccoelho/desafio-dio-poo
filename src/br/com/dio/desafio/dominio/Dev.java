package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
	
	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluido = new LinkedHashSet<>();
	
	public void inscreverBootCamp(BootCamp bc) {
		conteudosInscritos.addAll(bc.getConteudos());
		bc.getDevInscritos().add(this);
		
	}
	
	public void cancelarInscricaoBootCamp(BootCamp bc) {
		conteudosInscritos.removeAll(bc.getConteudos());
		bc.getDevInscritos().remove(this);
		
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			conteudosConcluido.add(conteudo.get());
			conteudosInscritos.remove(conteudo.get());
		}
		
	}

	public double calcularTotalXP() {
		return conteudosConcluido.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluido() {
		return conteudosConcluido;
	}

	public void setConteudosConcluido(Set<Conteudo> conteudosConcluido) {
		this.conteudosConcluido = conteudosConcluido;
	}
	
	
}
