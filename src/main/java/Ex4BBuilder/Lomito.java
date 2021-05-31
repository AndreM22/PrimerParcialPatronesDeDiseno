package Ex4BBuilder;

public class Lomito extends BuiderParrilla{

	@Override
	public void buildTipoDeCarne() {
		parrilla.setTipoDeCarne("Lomo.");
	}

	@Override
	public void buildSaborRefresco() {
		parrilla.setSaborRefresco("Pepsi.");
		
	}

	@Override
	public void buildGuarniciones() {
		parrilla.setGuarniciones("Arroz.");
		
	}

}
