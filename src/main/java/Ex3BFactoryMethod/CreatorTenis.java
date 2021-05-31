package Ex3BFactoryMethod;

public class CreatorTenis extends CreatorElementosDeportivos{
    @Override
    public Tenis create() {
        Tenis tenis = new Tenis();
        tenis.setTipo("Deportivos");
        tenis.setTalla("40");
        return tenis;
    }
}
