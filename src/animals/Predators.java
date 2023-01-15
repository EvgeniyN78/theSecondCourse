package animals;

public class Predators extends Mammals {
    public Predators(String name, Integer age, String livingEnvironment, Integer movementSpeed, String TypeOfFood) {
        super(name, age, livingEnvironment, movementSpeed, TypeOfFood);
    }

    @Override
    public String toString() {
        return "Хищники: " +
                "наименование: " + name +
                ", возраст: " + age +
                ", среда обитания: " + livingEnvironment +
                ", максимальная скорость: " + movementSpeed +
                " км/ч., тип питания: " + TypeOfFood;
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
    public void walk() {
        super.walk();
    }

    public void hunt() {

        System.out.println("Охотятся в своей среде обитания");
    }

}
