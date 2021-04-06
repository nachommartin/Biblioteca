package Biblioteca;

public class Libro extends Publicacion {
	private boolean prestado; 

	public Libro(int codigo, String titulo, Tematica tema, int anoPublicado, boolean prestado) {
		super(codigo, titulo, tema, anoPublicado);
		// TODO Auto-generated constructor stub
		this.prestado=false; 
		prestado=this.prestado;
	}
	

}
