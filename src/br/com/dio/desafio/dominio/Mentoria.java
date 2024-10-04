package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {

	private String titulo;
	private String descricao;
	private LocalDate data;
	public String getTitulo() {
		return titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public LocalDate getData() {
		return data;
	}
	@Override
	public String toString() {
		return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
	}
	
	
}
