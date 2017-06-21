package main;

/**
 * Como Mascota es Abstracta, no podrá ser instanciada directamete.
 * Solo vale para ser extendida.
 * Las clases que extienden de esta clase deberan imlementar el metodo
 * getPesoRacion()
 * 
 * El metodo getEstadoNutricion() no es abstracto por lo tanto puede ser o no ser refefinido.
 * 
 *
 */
public abstract class Mascota {
	
	private Person propietario;
	private String nombre;
	private float peso;
	private float altura;
	private float largo;
	
	public Mascota(String nombre, float peso, float altura, float largo){
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
		this.largo= largo;		
	}
	
	public Mascota(String nombre){
		this.nombre = nombre;
	}
		

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Esto es una mascota";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}

	public Person getPropietario() {
		return propietario;
	}

	public void setPropietario(Person propietario) {		
		this.propietario = propietario;
	}
	
	// Método que se redefinirá
	public float getEstadoNutricion() {
		return 0;
	}
	
	
	/**
	 * Metodo Abstracto que debe ser definidso en las clases que extienden (heredan) de
	 * esta clase (Mascota). 
	 * @return
	 */
	public abstract float getPesoRacion();

	

}
