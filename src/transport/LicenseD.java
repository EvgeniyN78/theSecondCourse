package transport;

public class LicenseD extends Driver <Bus>{
    public LicenseD(String FIO, String driverLicense, Integer experience) {
        super(FIO, driverLicense, experience);
    }

    public LicenseD() {
    }

    @Override
    public void checkLicense() {
        try {
            if (getDriverLicense() != "В/у кат.<D>" || getDriverLicense() == null || getDriverLicense().isEmpty()
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
        return "LicenseD{} " + super.toString();
    }
}
