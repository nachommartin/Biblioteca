package Biblioteca;

public class Revista extends Publicacion{
	private int numero;
	
	
	public Revista(int codigo, String titulo, Tematica tema, int anoPublicado, int numero) {
		super(codigo, titulo, tema, anoPublicado);
		// TODO Auto-generated constructor stub
		numero=this.numero; 
	}
	
	

}
