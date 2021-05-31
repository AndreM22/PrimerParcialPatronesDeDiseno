package Ex2BPrototype;

public class Celular implements ICelular {
	String modelo;
	String tamano;
	int peso;
	Camara camara;
	int imei;
	String origen;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	public int getImei() {
		return imei;
	}

	public void setImei(int imei) {
		this.imei = imei;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	@Override
	public Object clone() {
		Celular c = new Celular();
		c.modelo = this.modelo;
		c.setPeso(this.peso);
		c.setTamano(this.tamano);
		c.setCamara(this.camara);
		c.setOrigen(this.origen);
		c.setImei(this.imei);
		return c;
	}

	public void mostrarInfo() {
		System.out.println("Imei: " + imei);
		System.out.println("Modelo: " + modelo);
		System.out.println("Tamaño: " + tamano);
		camara.mostrarInfo();
		System.out.println("Origen: " + origen);
		System.out.println("*******");
	}
}
