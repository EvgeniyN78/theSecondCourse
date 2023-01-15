package transport;

import java.time.LocalDate;

import static animals.Validation.validatePassedDiagnostics;
import static checkValue.Validatoin.*;

public abstract class Car implements Competing {
    private final String brand;
    private final String model;
    private Double engineVolume; //объём двигателя в литрах
    private String passedDiagnostics; //прохождение диагностики

    public Car(String brand, String model, Double engineVolume, String passedDiagnostics) {
        this.brand = validateStandard(brand);
        this.model = validateStandard(model);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.passedDiagnostics = passedDiagnostics;
    }

    public Car(String brand, String model, Double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public void passDiagnostics() throws IllegalArgumentException {

    }


    public void start() {
        System.out.println("Завести двигатель. Начать движение.");
    }

    public void finish() {
        System.out.println("Остановиться. Заглушить двигатель.");
    }

    @Override
    public void pitStop() {
        System.out.println("Заехать на ТО.");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее вермя круга 5,3");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость 227 км/ч.");
    }

    public void getStartMessage() {
    }

    public abstract void printType();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public String getPassedDiagnostics() {
        return passedDiagnostics;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = validateEngineVolume(engineVolume);
    }

    public void setPassedDiagnostics(String passedDiagnostics) {
        this.passedDiagnostics = passedDiagnostics;
    }

    @Override
    public String toString() {
        return  "марка: " + brand +
                ", модель: " + model +
                ", объём двигателя: " + engineVolume;
    }
}

