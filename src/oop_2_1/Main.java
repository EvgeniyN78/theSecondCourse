package oop_2_1;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим", "Минск", 1983, "Бренд менеджер");
        Human anna = new Human("Анна", "Москва", 1993, "Методист ОП");
        Human katia = new Human("Катя", "Калининград", 1982, "Продакт-менеджер");
        Human artem = new Human("Артём", "Москва", 1995, "Директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань", 2001, "Временно безработный");

        System.out.println(maxim);
        System.out.println(anna);
        System.out.println(katia);
        System.out.println(artem);
        System.out.println(vladimir);


    }
}