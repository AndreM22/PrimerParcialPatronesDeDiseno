package Ex3BFactoryMethod;

public class Short implements IElementosDeportivos {
	private String talla;
	private String color;

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void crear() {
		System.out.println("Short:");
		System.out.println("Talla: " + talla);
		System.out.println("Color: " + color);
		System.out.println();
	}
}
