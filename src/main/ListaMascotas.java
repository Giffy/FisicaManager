package main;

public class ListaMascotas {
	
	private Mascota[] arrayMascotas;
	
	public ListaMascotas(){
		arrayMascotas = new Mascota[0];
	}
	
	public void add(Mascota mascota){
		Mascota[] temp = new Mascota[arrayMascotas.length +1];
		// Arrays.copyOf(mascotas, mascotas.length+1);
		int i=0;
		for (i=0; i<arrayMascotas.length; i++)
				temp [i]=arrayMascotas[i];
			temp [i] = mascota;
			arrayMascotas = temp;						
	}
	
	public Mascota get(int index){
		return arrayMascotas[index];
	}
	
	public int size(){
		return arrayMascotas.length;
	}
	
	
	public void remove (int index){
		Mascota copyMascota[]= new Mascota[arrayMascotas.length-1];
		int j=0;
		for (int i=0; i<arrayMascotas.length;i++){
			if(i!=index){
				copyMascota[j++]=arrayMascotas[i];
			}
		}
		arrayMascotas = copyMascota;		
	}

	
	/**
	 * Retorna todas las personas que contengan strName en su campo FullName
	 * @return
	 */
	
	public Mascota[] findByOwnerName(String strname){
	
		Mascota[] array = new Mascota [arrayMascotas.length];  
		int counter = 0;
						
		for(int i=0; i<arrayMascotas.length; i++){
			if(arrayMascotas[i].getPropietario().getFullName().startsWith(strname)){
				array[counter++]= arrayMascotas[i];					
			}
		}
			
		Mascota[] arrayaux = new Mascota [counter];
		for (int i=0; i<arrayaux.length; i++){
			arrayaux[i] =array[i];
		}
		
		return arrayaux;
	}

	
			
			
		/**
		 * Retorna todas las personas que coontengan strMail en su campo email
		 * @return
		 */
		
		
	public Mascota[] findByOwnerEmail(String strmail){
		
		Mascota[] array = new Mascota [arrayMascotas.length];  
		int counter = 0;
					
		for(int i=0; i<arrayMascotas.length; i++){
			if(arrayMascotas[i].getPropietario().getEmail().contains(strmail)){
				array[counter++]= arrayMascotas[i];					
			}
		}
		
		Mascota[] arrayaux = new Mascota [counter];
		for (int i=0; i<arrayaux.length; i++){
			arrayaux[i] =array[i];
		}
		
		return arrayaux;	
	}
	
	public void addNewMascota(String newMascota){
		String[] values = newMascota.split(";");
			
		String nombre = values[1];
		Float peso =  Float.valueOf(values[2]);
		Float altura = Float.valueOf(values[3]);
		Float largo = Float.valueOf(values[4]);
		String newOwner= toPropietarioFormat(values[5], values[6], values[7], values[8]);
		Person propietario = new Person(newOwner);
	
			
		if (values[0].toLowerCase()=="ave"){
			Ave ave= new Ave(nombre, peso, altura, largo);
			ave.setNombre(nombre);
			ave.setPeso(peso);
			ave.setAltura(altura);
			ave.setLargo(largo);
			ave.setPropietario(propietario);
			// add(ave);
		}else if (values[0].toLowerCase()=="canido"){		
			Canido can= new Canido(nombre, peso, altura, largo);
			can.setPropietario(propietario);
			// add(can);
		}else if (values[0].toLowerCase()=="felino"){		
			Felino fel= new Felino(nombre, peso, altura, largo);
			fel.setPropietario(propietario);
			add(fel);
		}else if (values[0].toLowerCase()=="roedor"){		
			Roedor roe= new Roedor(nombre, peso, altura, largo);
			roe.setPropietario(propietario);
			add(roe);
		}
						
	}
		
		
		public String toPropietarioFormat(String ownerName, String phone, String email, String address){
			return  ownerName + ";" + phone + ";" + email + ";" + address; 
		}
	
}
