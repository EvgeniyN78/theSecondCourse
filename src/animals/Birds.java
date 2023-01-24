package animals;

import java.util.Objects;

import static animals.Validation.validateStandardStr;

public abstract class Birds extends Animals {
    protected String typeOfMovement;

    public Birds(String name, Integer age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);

        this.typeOfMovement = validateStandardStr(typeOfMovement);
    }

    //    regionGS
    public String getTypeOfMovement() {
        return typeOfMovement;
    }
//    endregion

    //    regionMethods
    @Override
    public void eat() {
        System.out.println("Используют клюв");
    }

    @Override
    public void sleep() {
        System.out.println("В положении сидя");
    }

    @Override
    public void go() {
        System.out.println("Передвигаются в стаях");
    }

    public abstract void hunt();
//    endregion

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(typeOfMovement, birds.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }
}
