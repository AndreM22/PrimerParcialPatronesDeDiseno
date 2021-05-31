package Ex2BPrototype;

public class Camara implements ICamara {
	int foco;
	String lente;

	public int getFoco() {
		return foco;
	}

	public void setFoco(int foco) {
		this.foco = foco;
	}

	public String getLente() {
		return lente;
	}

	public void setLente(String lente) {
		this.lente = lente;
	}

	public void mostrarInfo() {
		System.out.println("C�mara foco: " + foco);
		System.out.println("C�mara Lente: " + lente);
	}

	@Override
	public Object clone() {
		Camara c = new Camara();
		c.setFoco(foco);
		c.setLente(lente);

		return c;
	}
}
