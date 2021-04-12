package Biblioteca;
import java.util.Scanner;
import java.util.Arrays; 


public class MainBiblio {
	public static Scanner teclado = new Scanner(System.in);
	public static Publicacion lista [] = new Publicacion [100];




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		int codigo;
		String titulo;
		String tema;
		int anoPubli; 
		int numeroRev; 
		System.out.println("Seleccione una opción");
		opcion= leerEntero(" 1.- Dar de alta libro\n 2.- Dar de alta revista\n 3.- Comprobar si libro está prestado\n 4.- Prestar libro\n 5.- Devolver libro\n 6.- Mostrar información\n 7.- Salir");
		int aux;
		boolean encontrado=false;
		for (aux=0; aux <=lista.length-1 && !encontrado; aux++) {
			if (lista[aux]==null) {
				encontrado=true;  }
			}
		switch (opcion) {
		case 1:
			try {
				codigo = leerEntero("Codigo del libro: ");
				titulo = leerCadena ("Titulo del libro: ");
				tema = leerCadena ("Tema: Aventura, Historia o Acción: ");
				anoPubli = leerEntero("Año publicación: ");
				lista[aux-1]= new Libro (codigo,titulo,tema.toUpperCase(),anoPubli);
				System.out.println("Libro registrado");
				}catch(Exception E) {
					System.out.println("Tema no disponible");
				}
				break;
		case 2:
			try {
				codigo = leerEntero("Codigo de la revista: ");
				titulo = leerCadena ("Titulo de la revista: ");
				tema = leerCadena ("Tema: Aventura, Historia o Acción: ");
				anoPubli = leerEntero("Año publicación: ");
				numeroRev = leerEntero("Número de la revista: ");
				lista[aux-1]= new Revista (codigo,titulo,tema.toUpperCase(),anoPubli, numeroRev);
				System.out.println("Revista registrada");
				}catch(Exception E) {
					System.out.println("Tema no disponible");
				}
				break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		default:
			System.out.println("Opción incorrecta");
			
		}
		}
	
	public static int leerEntero(String msg) {
		System.out.println(msg);
		int aux= Integer.parseInt(teclado.nextLine());
		return aux;
	}
	
	public static String leerCadena(String msg) {
		System.out.println(msg);
		String cadena= (teclado.nextLine());
		return cadena;
	}	
	
	public static int buscarLista(String titulo) {
		boolean encontrado= false;
		int resul = 0;
		for (int i = 0; i < lista.length && !encontrado; i++) {
			if (lista[i].getTitulo().equals(titulo)){ /*He tenido que hacer un get de titulo*/
				encontrado = true;
				resul = i;
			}
		}
		return resul;
	
	}
	
	
	
}
