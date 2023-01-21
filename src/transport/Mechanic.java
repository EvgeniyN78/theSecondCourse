package transport;

public class Mechanic <T extends Car> {

    private final String nameAndSurname;
    private final String companyMechanic;

    public Mechanic(String nameAndSurname, String companyMechanic) {
        this.nameAndSurname = nameAndSurname;
        this.companyMechanic = companyMechanic;
    }

    public void doService(T car) {
        car.service();
    }

    public void doRepair(T car) {
        car.repair();
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public String getCompanyMechanic() {
        return companyMechanic;
    }

    @Override
    public String toString() {
        return '\n' + "Механик " + nameAndSurname +
                ", Компания " + '\"' + companyMechanic +'\"';
    }
}
