package animals;

public class Amphibians extends Animals {

    public Amphibians(String name, Integer age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    @Override
    public String toString() {
        return "Земноводные: " +
                "наименование: " + name +
                ", возраст: " + age +
                ", среда обитания: " + livingEnvironment;
    }

    //    regionMethods
    @Override
    public void eat() {
        System.out.println("Питается насекомыми");
    }

    @Override
    public void sleep() {
        System.out.println("Спит на суше");
    }

    @Override
    public void go() {
        System.out.println("Плавает в воде, и перемещается по суше");
    }

    public void hunt() {
        System.out.println("Охотится на насекомых");
    }
//    endregion
}
