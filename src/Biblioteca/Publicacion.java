package Biblioteca;

public abstract class Publicacion  {
	private int codigo;
	private String titulo;
	private Tematica tema; 
	private int anoPublicado;
	
	
	public Publicacion(int codigo, String titulo, Tematica tema, int anoPublicado) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.tema = tema;
		this.anoPublicado = anoPublicado;
	}
	
	@Override
	public String toString() {
		return "Publicacion [codigo=" + codigo + ", titulo=" + titulo + ", tema=" + tema + ", anoPublicado="
				+ anoPublicado + "]";
	}
	 
	public int getCodigo() {
		return codigo;
	}

	public int getAnoPublicado() {
		return anoPublicado;
	}

}
