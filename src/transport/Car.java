package transport;

import java.time.LocalDate;
import java.util.*;

import static animals.Validation.validatePassedDiagnostics;
import static checkValue.Validatoin.*;

public abstract class Car implements Competing {
    private final String brand;
    private final String model;
    private Double engineVolume; //объём двигателя в литрах
    private String passedDiagnostics; //прохождение диагностики

    private ArrayList<Mechanic> mechanics;
    private ArrayList<Sponsor> sponsors;
    public HashMap<Car, Mechanic> carMechanicHashMap;


    public Car(String brand, String model, Double engineVolume, String passedDiagnostics) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.passedDiagnostics = passedDiagnostics;
        mechanics = new ArrayList<>();
        sponsors = new ArrayList<>();
        carMechanicHashMap = new HashMap<>();
    }

    public Car(String brand, String model, Double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

//    private List <Driver> drivers;
//    private List <Mechanic> mechanics;
//    private List <Sponsor> sponsors;

    //regionMetods

    public abstract boolean service();

    public abstract void repair();

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

    //endregion


//    public List<Driver> getDrivers() {
//        return drivers;
//    }
//
//    public List<Mechanic> getMechanics() {
//        return mechanics;
//    }
//
//    public List<Sponsor> getSponsors() {
//        return sponsors;
//    }


    public ArrayList<Mechanic> getMechanics() {
        return mechanics;
    }

    public ArrayList<Sponsor> getSponsors() {
        return sponsors;
    }

    public HashMap<Car, Mechanic> getCarMechanicHashMap() {
        return carMechanicHashMap;
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(engineVolume, car.engineVolume) && Objects.equals(passedDiagnostics, car.passedDiagnostics) && Objects.equals(mechanics, car.mechanics) && Objects.equals(sponsors, car.sponsors) && Objects.equals(carMechanicHashMap, car.carMechanicHashMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, passedDiagnostics, mechanics, sponsors, carMechanicHashMap);
    }

    @Override
    public String toString() {
        return  "марка: " + brand +
                ", модель: " + model +
                ", объём двигателя: " + engineVolume;
    }
}

