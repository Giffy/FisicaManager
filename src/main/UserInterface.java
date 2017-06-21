package main;

import utils.Input;

public class UserInterface {
	
	public static String askMascota(){
		System.out.print("Tipo de mascota?   Ave, Canido, Felino o Roedor");
		String object = Input.scannLine();
		
		System.out.print("Cual es el nombre de la mascota?");
		String name = Input.scannLine();
		
		System.out.print("Cual es el peso?");
		float peso = Input.scannFloat();
		
		
		System.out.print("Cual es la altura?");
		float altura = Input.scannFloat();

		System.out.print("Cual es el largo?");
		float largo = Input.scannFloat();

		System.out.print("Cual es el nombre y apellidos del propietario?");
		String ownerName = Input.scannLine();

		System.out.print("Cual es el telefono?");
		float phone = Input.scannFloat();

		System.out.print("Cual es el email?");
		String email = Input.scannLine();

		System.out.print("Cual es el direccion?");
		String address = Input.scannLine();
			
		return object + ";" + name + ";" + peso + ";" + altura + ";" + largo + ";" + ownerName + ";" + phone + ";" + email + ";" + address;
		
	}

	
	
}
