package com.sdi;

public class Comentario {

	private String autor;
	private String contenido;

	public Comentario() {
	}

	public Comentario(String autor, String contenido) {
		this.autor = autor;
		this.contenido = contenido;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
