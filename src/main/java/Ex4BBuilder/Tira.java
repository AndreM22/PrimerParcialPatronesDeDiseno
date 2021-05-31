package Ex4BBuilder;

public class Tira extends BuiderParrilla{

	@Override
	public void buildTipoDeCarne() {
		parrilla.setTipoDeCarne("Tira de carne");
	}

	@Override
	public void buildSaborRefresco() {
		parrilla.setSaborRefresco("CocaCola");
		
	}

	@Override
	public void buildGuarniciones() {
		parrilla.setGuarniciones("Fideo");
		
	}

}
