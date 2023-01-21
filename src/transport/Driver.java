package transport;

public abstract class Driver <T extends Car>{

    private String FIO;
    private String driverLicense;
    private Integer experience;

    public Driver(String FIO, String driverLicense, Integer experience) {
        this.FIO = FIO;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    public Driver() {
    }

    public abstract void checkLicense();

    public void startMoving() {
        System.out.println("Включить передачу. Начать движение");
    }

    public void finishMoving() {
        System.out.println("Остановиться. Заглушить двигатель.");
    }
    public void refuel() {
        System.out.println("Заправить топливный бак.");
    }

    public String getFIO() {
        return FIO;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return '\n' + "Водитель: " +
                "ФИО: " + FIO + " " +
                driverLicense +
                ", стаж: " + experience + " лет.";
    }
}
