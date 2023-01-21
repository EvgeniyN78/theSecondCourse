package transport;

public class Sponsor <T extends Car> {

    private final String name;
    private Integer amountOfSupport;

    public Sponsor(String name, Integer amountOfSupport) {
        this.name = name;
        this.amountOfSupport = amountOfSupport;
    }

    public void sponsorRace() {
        amountOfSupport = 0;
    }

    public String getName() {
        return name;
    }

    public Integer getAmountOfSupport() {
        return amountOfSupport;
    }

    public void setAmountOfSupport(Integer amountOfSupport) {
        this.amountOfSupport = amountOfSupport;
    }

    @Override
    public String toString() {
        return '\n' + "Спонсор " +
                "компания: " + '\"' + name + '\"' +
                ", сумма заезда: " + amountOfSupport +  " руб." + "\n";
    }
}
