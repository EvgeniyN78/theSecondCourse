package animals;

import java.util.Objects;

import static animals.Validation.validateStandardInteger;
import static animals.Validation.validateStandardStr;

public abstract class Mammals extends Animals {
    protected Integer movementSpeed;
    protected String TypeOfFood;

    public Mammals(String name, Integer age, String livingEnvironment, Integer movementSpeed, String TypeOfFood) {
        super(name, age, livingEnvironment);
        this.movementSpeed = validateStandardInteger(movementSpeed, 1);
        this.TypeOfFood = validateStandardStr(TypeOfFood, "milk");

    }

    //    regionGS
    public Integer getMovementSpeed() {
        return movementSpeed;
    }

    public String getTypeOfFood() {
        return TypeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.TypeOfFood = validateStandardStr(TypeOfFood);
    }
//    endregion

//    regionMethods

    @Override
    public void eat() {
        System.out.println("Регулярно");
    }

    @Override
    public void sleep() {
        System.out.println("Ночью");
    }

    @Override
    public void go() {
        System.out.println("Передвигаются по суше");
    }

    public void walk() {
        System.out.println("Гуляют в среде обитания");
    }

//    endregion


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return Objects.equals(movementSpeed, mammals.movementSpeed) && Objects.equals(TypeOfFood, mammals.TypeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementSpeed, TypeOfFood);
    }
}
