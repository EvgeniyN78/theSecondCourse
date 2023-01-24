package animals;

import java.util.Objects;

import static animals.Validation.validateStandardInteger;
import static animals.Validation.validateStandardStr;

public abstract class Animals {
    protected String name;
    protected Integer age;
    protected String livingEnvironment;

    public Animals(String name, Integer age, String livingEnvironment) {
        this.name = validateStandardStr(name);
        this.age = validateStandardInteger(age, 1);
        this.livingEnvironment = validateStandardStr(livingEnvironment);
    }

    //regionGS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validateStandardStr(name);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = validateStandardInteger(age, 1);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = validateStandardStr(livingEnvironment);
    }
    //endregion

    public abstract void eat();

    public abstract void sleep();

    public abstract void go();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
