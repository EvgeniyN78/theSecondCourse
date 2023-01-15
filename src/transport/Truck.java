package transport;

public class Truck <T extends LicenseC> extends Car{

    protected LoadCapasity loadCapasity;

    public Truck(String brand, String model, Double engineVolume, LoadCapasity loadCapasity, String passedDiagnostics) {
        super(brand, model, engineVolume, passedDiagnostics);
        this.loadCapasity = loadCapasity;
    }

    public Truck(String brand, String model, Double engineVolume, String passedDiagnostics) {
        super(brand, model, engineVolume, passedDiagnostics);
    }

    @Override
    public void passDiagnostics() throws IllegalArgumentException{
        if (getPassedDiagnostics() == "yes") {
            System.out.println("Грузовик " + getBrand() + " " + getModel() + " прошёл диагностику.");
        } else {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.out.println("Грузовик " + getBrand() + " " + getModel() + " не прошёл диагностику!");
            }
        }

    }

    @Override
    public void printType() {
        if (getLoadCapasity() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getLoadCapasity());
        }
    }

    public LoadCapasity getLoadCapasity() {
        return loadCapasity;
    }

    public void setLoadCapasity(LoadCapasity loadCapasity) {
        this.loadCapasity = loadCapasity;
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void finish() {
        super.finish();
    }

    @Override
    public void pitStop() {
        super.pitStop();
    }

    @Override
    public void bestLapTime() {
        super.bestLapTime();
    }

    @Override
    public void maxSpeed() {
        super.maxSpeed();
    }

    public void getStartMessage(LicenseC licenseC) {
        System.out.println("Водитель " + licenseC.getFIO() + " управляет автомобилем " + getBrand() +
                " и будет участвовать в заезде");
    }

    @Override
    public String toString() {
        return "Грузовик: " + super.toString() + getLoadCapasity();
    }
}
