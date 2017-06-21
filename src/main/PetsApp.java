package main;

public class PetsApp {

	public static void main(String args[]){
		Canido mascota0 = new Canido("Coco");
		// Mascota mascota1 = new Mascota("Coco");      No se puede porque Mascota es una clase abstracta
		
		ListaMascotas list= new ListaMascotas ();
		
		String newMascota= UserInterface.askMascota();
		
		list.addNewMascota(newMascota);
		
		
		
	}
	
}
