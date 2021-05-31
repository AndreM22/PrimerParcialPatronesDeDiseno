package Ex3BFactoryMethod;

public class Camiseta implements IElementosDeportivos {
	private String talla;
	private String equipo;

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	@Override
	public void crear() {
		System.out.println("Camiseta:");
		System.out.println("Talla: " + talla);
		System.out.println("Equipo: " + equipo);
		System.out.println();
	}

}
