package Ex3BFactoryMethod;

public class PelotaDeFutbol implements IElementosDeportivos {
	private String tamano;
	private String color;
	private String garantia;

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void crear() {
		System.out.println("Pelota de Futbol:");
		System.out.println("Tamaño: " + tamano);
		System.out.println("Color: " + color);
		System.out.println("Garantia: " + garantia);
		System.out.println();
	}

	public String getGarantia() {
		return garantia;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}
}
