package Ex3BFactoryMethod;

public class CreatorShort extends CreatorElementosDeportivos{
    @Override
    public Short create() {
        Short shorte = new Short();
        shorte.setColor("Rojo");
        shorte.setTalla("S");
        return shorte;
    }
}
