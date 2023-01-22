package transport;

public class LicenseB extends Driver <PassengerCar>{
    public LicenseB(String FIO, String driverLicense, Integer experience) {
        super(FIO, driverLicense, experience);
    }

    public LicenseB() {
    }

    public void checkLicense() {
        try {
            if (getDriverLicense() != "В/у кат.<B>" || getDriverLicense() == null || getDriverLicense().isEmpty()
                    || getDriverLicense().isBlank()) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Водителю " + getFIO() + " необходимо указать тип прав");
        }

    }

    @Override
    public void startMoving() {
        super.startMoving();
    }

    @Override
    public void finishMoving() {
        super.finishMoving();
    }

    @Override
    public void refuel() {
        super.refuel();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
