package transport;

public class Mechanic <T extends Car> {

    private final String nameAndSurname;
    private final String companyMechanic;

    protected Specialization specialization;


    public Mechanic(String nameAndSurname, String companyMechanic, Specialization specialization) {
        this.nameAndSurname = nameAndSurname;
        this.companyMechanic = companyMechanic;
        this.specialization = specialization;
    }

    public enum Specialization {
        MECH_CAR("специализация: легковые авто"),
        MECH_TRUCK("специализация: грузовые авто"),
        MECH_BUS("специализация: автобусы"),
        MECH_CAR_TRUCK("специализация: легковые и грузовые авто"),
        MECH_CAR_BUS("специализация: легковые авто и автобусы"),
        MECH_TRUCK_BUS("специализация: грузовые авто и автобусы"),
        MECH_UNIVERSAL("механик универсал");

        public String nameSpecialization;

        Specialization(String nameSpecialization) {
            this.nameSpecialization = nameSpecialization;
        }

        public String getNameSpecialization() {
            return nameSpecialization;
        }

        @Override
        public String toString() {
            return nameSpecialization;
        }
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
                ", Компания " + '\"' + companyMechanic +'\"'
                + ", " + specialization;
    }

}
