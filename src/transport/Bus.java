package transport;

import java.io.IOException;
import java.util.ArrayList;

public class Bus <T extends LicenseD> extends Car{

    protected Size size;

    private ArrayList<T> drivers;

    public Bus(String brand, String model, Double engineVolume, Size size, String passedDiagnostics) {
        super(brand, model, engineVolume, passedDiagnostics);
        this.size = size;
        drivers = new ArrayList<>();
    }

    //regionMetods

    @Override
    public boolean service() {
        System.out.println("Автобусу " + getBrand() + " " + getModel() + " диагностика не требуется.");
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " починен");
    }

    @Override
    public void passDiagnostics() throws IllegalArgumentException{
        throw new IllegalArgumentException("Автобусу " + getBrand() + " диагностика не требуется");
    }

    @Override
    public void printType() {
        if (getSize() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getSize());
        }
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

    public void getStartMessage(LicenseD licenseD) {
        System.out.println("Водитель " + licenseD.getFIO() + " управляет автомобилем " + getBrand() +
                " и будет участвовать в заезде");
    }
//endregion

    public ArrayList<T> getDrivers() {
        return drivers;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return '\n' + "Автобус: " + super.toString() + getSize();
    }
}
