package Biblioteca;

public class Libro extends Publicacion implements Prestable{
	private boolean prestado; 

	public Libro(int codigo, String titulo, Tematica tema, int anoPublicado) {
		super(codigo, titulo, tema, anoPublicado);
		// TODO Auto-generated constructor stub
		this.prestado=false; 
	}

	@Override
	public void prestar() {
		// TODO Auto-generated method stub
		this.prestado = true;
		
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		this.prestado = false;
		
	}

	@Override
	public boolean prestado() {
		// TODO Auto-generated method stub
		return this.prestado;
	}
	

}
