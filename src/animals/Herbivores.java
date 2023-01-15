package animals;

public class Herbivores extends Mammals {

    public Herbivores(String name, Integer age, String livingEnvironment, Integer movementSpeed, String TypeOfFood) {
        super(name, age, livingEnvironment, movementSpeed, TypeOfFood);
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

    public void grazing() {
        System.out.println("Пасутся на открытой местности");
    }

    @Override
    public String toString() {
        return "Травоядные: " +
                "наименование: " + name +
                ", возраст: " + age +
                ", среда обитания: " + livingEnvironment +
                ", максимальная скорость: " + movementSpeed +
                " км/ч., тип питания: " + TypeOfFood;
    }
}
