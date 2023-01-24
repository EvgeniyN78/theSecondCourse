package transport.enumeration;

public enum BodyType {

    SEDAN("Седан"),
    HATCHBACK("Хэтчбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивен");

    private String nameBodyType;

    BodyType(String nameBodyType) {
        this.nameBodyType = nameBodyType;
    }

    public String getNameBodyType() {
        return nameBodyType;
    }

    @Override
    public String toString() {
        return nameBodyType + ".";
    }
}
