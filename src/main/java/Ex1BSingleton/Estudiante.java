package Ex1BSingleton;

public class Estudiante {
	String nombre;
	int ci;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	
	public void mostrarInfo() {
		System.out.println("Nombre: "+ nombre);
		System.out.println("CI: "+ci);
	}
}
