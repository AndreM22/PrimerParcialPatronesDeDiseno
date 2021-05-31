package Ex3BFactoryMethod;

public class CreatorMedias extends CreatorElementosDeportivos{
    @Override
    public Medias create() {
        Medias medias = new Medias();
        medias.setTamano("Medium");
        medias.setDeporte("Wally");
        return medias;
    }
}
