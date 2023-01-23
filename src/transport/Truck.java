package transport;

import java.util.ArrayList;

public class Truck <T extends LicenseC> extends Car{

    protected LoadCapasity loadCapasity;

    private ArrayList<T> drivers;

    public Truck(String brand, String model, Double engineVolume, LoadCapasity loadCapasity, String passedDiagnostics) {
        super(brand, model, engineVolume, passedDiagnostics);
        this.loadCapasity = loadCapasity;
        drivers = new ArrayList<>();
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

    public ArrayList<T> getDrivers() {
        return drivers;
    }

    @Override
    public boolean service() {
        return Math.random() > 0.75;
    }

    @Override
    public void repair() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " починен");
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
        return '\n' + "Грузовик: " + super.toString() + getLoadCapasity();
    }
}
