package animals;

public class Fling extends Birds {

    public Fling(String name, Integer age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment, typeOfMovement);
    }

    @Override
    public String toString() {
        return "Птицы летающие: " +
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
        System.out.println("Охотятся за насекомыми");
    }

    public void fly() {
        System.out.println("Летают, используя крылья");
    }

}
