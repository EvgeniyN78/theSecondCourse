package transport;

import java.io.IOException;

public class Bus <T extends LicenseD> extends Car{

    protected Size size;

    public Bus(String brand, String model, Double engineVolume, Size size, String passedDiagnostics) {
        super(brand, model, engineVolume, passedDiagnostics);
        this.size = size;
    }

    public Bus(String brand, String model, Double engineVolume, String passedDiagnostics) {
        super(brand, model, engineVolume, passedDiagnostics);
    }

    public Bus(String brand, String model, Double engineVolume, Size size) {
        super(brand, model, engineVolume);
        this.size = size;
    }

    @Override
    public void passDiagnostics() throws IllegalArgumentException{
        throw new IllegalArgumentException("Автобусу " + getBrand() + " диагностика не требуется");
    }


    //regionMetods

    @Override
    public void printType() {
        if (getSize() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getSize());
        }
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
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

    @Override
    public String toString() {
        return "Автобус: " + super.toString() + getSize();
    }
}
