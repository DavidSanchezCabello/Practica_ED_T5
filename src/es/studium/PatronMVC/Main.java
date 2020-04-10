package es.studium.PatronMVC;

public class Main {

	public static void main(String[] args) {
		
		Modelo modelo = new Modelo();
		Vista vista = new Vista();
		
		new Controlador (vista, modelo);

	}

}
