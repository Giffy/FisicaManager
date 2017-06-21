package main;


public class Ave extends Mascota {

	private float calidadPlumas;
	
	public Ave(String nombre, float peso, float altura, float largo) {
		super(nombre, peso, altura, largo);
		this.calidadPlumas = 1;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getEstadoNutricion() {
		// Peso/(altura*largo)
		return getPeso()*(0.5f*getAltura()*getLargo());
	}
	
	@Override    												// de un metodo abstracto
	public float getPesoRacion() {
		// 0.1*Peso*(2-CalidadClomillos)
		return 0.1f*getPeso()*(2f-calidadPlumas);
	}	
	
	
	
}
