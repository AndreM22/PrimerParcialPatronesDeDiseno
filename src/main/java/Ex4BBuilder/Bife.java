package Ex4BBuilder;

public class Bife extends BuiderParrilla{

	@Override
	public void buildTipoDeCarne() {
		parrilla.setTipoDeCarne("Bife");
	}

	@Override
	public void buildSaborRefresco() {
		parrilla.setSaborRefresco("CocaCola");
		
	}

	@Override
	public void buildGuarniciones() {
		parrilla.setGuarniciones("Papas fritas");
		
	}

}
