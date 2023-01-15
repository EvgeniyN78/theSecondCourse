package animals;

public class NotFling extends Birds {
    public NotFling(String name, Integer age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment, typeOfMovement);
    }

    @Override
    public String toString() {
        return "Птицы нелетающие: " +
                "наименование: " + name +
                ", возраст: " + age +
                ", среда обитания: " + livingEnvironment +
                ", способ передвижения: " + typeOfMovement;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void go() {
        super.go();
    }

    @Override
    public void hunt() {
        System.out.println("Охотятся днём");
    }

    //возможно метод интерфейса:
//    @Override
//    public void walk() {
//        super.walk();
//    }

}
