package animals;

public class Zoo {
    public static void main(String[] args) {

        Herbivores gazelle = new Herbivores("Газель", 3, "Полупустыня", 70, "Трава");
        Herbivores giraffe = new Herbivores("Жираф", 4, "Тропические степи", 60, "Листья");
        Herbivores horse = new Herbivores("Лошадь", 5, "Конюншни", 60, "Сено");

        System.out.println(gazelle);
        gazelle.eat();
        gazelle.go();
        gazelle.sleep();
        gazelle.walk();
        gazelle.grazing();
        System.out.println(giraffe);
        giraffe.eat();
        giraffe.go();
        giraffe.sleep();
        giraffe.walk();
        giraffe.grazing();
        System.out.println(horse);
        horse.eat();
        horse.go();
        horse.sleep();
        horse.walk();
        horse.grazing();

        Predators hyena = new Predators("Гиена", 4, "Саванна", 60, "Падаль");
        Predators tiger = new Predators("Тигр", 5, "Саванна", 60, "Мясо животных");
        Predators bear = new Predators("Медведь", 6, "Лес", 120, "Всеядные");

        System.out.println(hyena);
        hyena.eat();
        hyena.sleep();
        hyena.go();
        hyena.hunt();
        hyena.walk();
        System.out.println(tiger);
        tiger.eat();
        tiger.sleep();
        tiger.go();
        tiger.hunt();
        tiger.walk();
        System.out.println(bear);
        bear.eat();
        bear.sleep();
        bear.go();
        bear.hunt();
        bear.walk();

        Amphibians frog = new Amphibians("Лягушка", 2, "Водоём");
        Amphibians grasSnake = new Amphibians("Уж пресноводный", 1, "Водоём");

        System.out.println(frog);
        frog.eat();
        frog.sleep();
        frog.go();
        frog.hunt();
        System.out.println(grasSnake);
        grasSnake.eat();
        grasSnake.sleep();
        grasSnake.go();
        grasSnake.hunt();

        NotFling peacock = new NotFling("Павлин", 3, "Саванна", "ходьба");
        NotFling penguin = new NotFling("Пингвин", 3, "Антарктика", "ходьба и плавание");
        NotFling dodoBird = new NotFling("птица Додо", 2, "Джунгли", "ходьба");

        System.out.println(peacock);
        peacock.eat();
        peacock.go();
        peacock.sleep();
        peacock.hunt();
        System.out.println(penguin);
        penguin.eat();
        penguin.go();
        penguin.sleep();
        penguin.hunt();
        System.out.println(dodoBird);
        dodoBird.eat();
        dodoBird.go();
        dodoBird.sleep();
        dodoBird.hunt();

        Fling seagull = new Fling("Чайка", 2, "Берега водоёмов", "полёт");
        Fling albatross = new Fling("Альбатрос", 4, "Берега водоёмов", "полёт");
        Fling falcon = new Fling("Сокол", 5, "Степь", "полёт");

        System.out.println(seagull);
        seagull.eat();
        seagull.go();
        seagull.fly();
        seagull.sleep();
        seagull.hunt();
        System.out.println(albatross);
        albatross.eat();
        albatross.go();
        albatross.fly();
        albatross.sleep();
        albatross.hunt();
        System.out.println(falcon);
        falcon.eat();
        falcon.go();
        falcon.fly();
        falcon.sleep();
        falcon.hunt();

    }


}
