package transport;

public class PassengerCar <T extends LicenseB> extends Car implements Competing{

    protected BodyType bodyType;

    public PassengerCar(String brand, String model, Double engineVolume, BodyType bodyType, String passedDiagnostics) {
        super(brand, model, engineVolume, passedDiagnostics);
        this.bodyType = bodyType;
    }

    public PassengerCar(String brand, String model, Double engineVolume, String passedDiagnostics) {
        super(brand, model, engineVolume, passedDiagnostics);
    }



    public BodyType getBodyType() {
            return bodyType;
    }

    public void setBodyType(BodyType BodyType) {
            this.bodyType = bodyType;
    }

    //regionMetods


    @Override
    public void passDiagnostics() throws IllegalArgumentException{
        if (getPassedDiagnostics() == "yes") {
            System.out.println("Автомобиль " + getBrand() + " " + getModel() + " прошёл диагностику.");
        } else {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.out.println("Автомобиль " + getBrand() + " " + getModel() + " не прошёл диагностику!");
            }
        }
    }




    @Override
    public void printType() {
        if (getBodyType() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getBodyType());
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

    public void getStartMessage(LicenseB licenseB) {
        System.out.println("Водитель " + licenseB.getFIO() + " управляет автомобилем " + getBrand() +
                " и будет участвовать в заезде");
    }
//endregion

    @Override
    public String toString() {
        return "Легковой автомобиль: " + super.toString() + ", тип кузова: " + getBodyType();
    }
}
