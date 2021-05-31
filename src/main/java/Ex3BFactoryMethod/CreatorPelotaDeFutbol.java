package Ex3BFactoryMethod;

public class CreatorPelotaDeFutbol extends CreatorElementosDeportivos{
    @Override
    public PelotaDeFutbol create() {
        PelotaDeFutbol pelotaDeFutbol = new PelotaDeFutbol();
        pelotaDeFutbol.setTamano("Regular");
        pelotaDeFutbol.setColor("Blanco y negro");
        pelotaDeFutbol.setGarantia("1 año");
        return pelotaDeFutbol;
    }
}
