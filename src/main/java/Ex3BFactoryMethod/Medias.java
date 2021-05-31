package Ex3BFactoryMethod;

public class Medias implements IElementosDeportivos{
    private String tamano;
    private String deporte;


    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    
    @Override
    public void crear() {
    	System.out.println("Medias:");
    	System.out.println("Tamaño: "+tamano);
    	System.out.println("Deporte: "+deporte);
    	System.out.println();
    }
}
