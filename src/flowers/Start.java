package flowers;

public class Start {
    public static void main(String[] args) {

        Flower rose = new Flower("Роза", " ", "Голандия", 35.59, null, 5);
        Flower hrisantem = new Flower("Хризантема", " ", "", 15.00, 5, 5);
        Flower pion = new Flower("Пион", "", "Англия", 69.90, 1, 0);
        Flower gipsofila = new Flower("Гипсогена", "", "Турция", 19.5, 10, 5);

//        System.out.println(rose);
//        System.out.println(hrisantem);
//        System.out.println(pion);
//        System.out.println(gipsofila);

        Flower[] bouquet = new Flower[]{rose, hrisantem, pion, gipsofila};
//                new Flower("Роза обыкновенная","","Голандия",35.59, 3, 5),
//                new Flower("Хризантема", "", "",15.00,5, 5),
//                new Flower("Пион","","Англия", 69.90, 1, 0),
//                new Flower("Гипсофила",null,"Турция", 19.50,10, 5)
//        };

        rose.setQuantity(12);
        rose.setLifeSpan(7);

        System.out.print("Букет в котором есть:");
        printListBouquet(bouquet);
        System.out.print(", будет стоить: " + calculationSumBouquet(bouquet) + " руб.");
        System.out.println(" и простоит: " + calculationMinLifeSpan(bouquet) + " дней.");
    }

    public static double calculationSumBouquet(Flower[] bouquet) {
        double sum = 0;
        for (Flower flower : bouquet) {
            sum = sum + (flower.getQuantity() * flower.getCost());
        }
        return sum * 1.10;
    }

    public static void printListBouquet(Flower[] bouquet) {
        for (Flower flower : bouquet) {
            if (flower.getQuantity() > 0) {
                System.out.print(" " + flower.getName() + " " + flower.getQuantity() + " шт.");
            }
        }
    }

    public static int calculationMinLifeSpan(Flower[] bouquet) {
        int minLifeSpan = 1000000;
        for (Flower flower : bouquet) {
            if (flower.getQuantity() > 0) {
                if (minLifeSpan > flower.getLifeSpan()) {
                    minLifeSpan = flower.getLifeSpan();
                }
            }
        }
        return minLifeSpan;
    }
}
