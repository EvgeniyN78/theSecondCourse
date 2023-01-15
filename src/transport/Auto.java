package transport;

public class Auto {
    public static void main(String[] args) {
//region Инкапсуляция
//        Car lada = new Car("Lada","Granta",2015, "Россия", "жёлтый",
//                180,1.7, "Механика", "Хетчбек", "х000хх000", 5,
//                "w");
// добавлены поля, нужно переписывать:
//        Car audi = new Car("Audi","A8 50 L TDI quattro",3.0, "чёрный", 2020, "Германия",
//                "Механика", "Хетчбек", "х000хх000", 5, "w");
//        Car bmv = new Car("BMW","Z8",3.0, "чёрный", 2021, "Германия",
//                "Механика", "Хетчбек", "х000хх000", 5, "w");
//        Car kia = new Car("Kia","Sportage",2.4, "красный", 2018, "Южная Корея",
//                "Механика", "Хетчбек", "х000хх000", 5, "w");
//        Car hyundai = new Car("Hyundai","Avante",1.6, "оранжевый", 2016, "Южная Корея",
//                "Механика", "Хетчбек", "х000хх000", 5, "w");
//
//        System.out.println(lada);
//        System.out.println(audi);
//        System.out.println(bmv);
//        System.out.println(kia);
//        System.out.println(hyundai);
//
//        Car.changeTiresForSeasonalOnes();
//
//        Car.Key ladaKey = lada.new Key("Yes", "No");
//        Car.Insurance ladaInsurance = lada.new Insurance(LocalDate.of(2003, 9, 6), 12000.00, "54dh4578j");
//
//        System.out.println(ladaKey);
//        System.out.println(ladaInsurance);
//endregion

//regionНаследование
//
//        Train lastochka = new Train("Ласточка", "B-901", 2011, "России", "", 0,
//                3500.00, 0.0, "Белорусский вокзал", "Минск-Пассажирский", 11);
//
//        Train leningrad = new Train("Ленинград", "D-125", 2019, "России", "", 270,
//                1700.00, 0.0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
//
//        System.out.println(lastochka);
//        lastochka.refill();
//        System.out.println(leningrad);
//        leningrad.refill();
//
//        Bus icarus = new Bus("Икарус", "a7500", 1980, "Венгрия",
//                "Жёлтый", 160, 10, "дизель");
//        Bus mercedes = new Bus("Мерседес", "Спринтер", 2022, "Германия", "", 200, 5);
//        Bus paz = new Bus("ПАЗ", "320530-04", 2017, " ", " ", 160, 190);
//
//        System.out.println(icarus);
//        icarus.refill();
//        System.out.println(mercedes);
//        mercedes.refill();
//        System.out.println(paz);
//        paz.refill();
//endregion

//regionПолиморфизм, перечисления (enum)

        PassengerCar ford = new PassengerCar("Ford", "focus", 2.2, "yes");
        PassengerCar volvo = new PassengerCar("Volvo", "s90", 2.0, BodyType.SEDAN, "yes");
        PassengerCar toyota = new PassengerCar("Toyota", "hilux", 2.5, "yes");
        PassengerCar volkswagen = new PassengerCar("Volkswagen", "polo", 2.0,
                BodyType.SEDAN, "yes");

//        LicenseB ivanovOS = new LicenseB("Иванов О.С.", "В/у кат.<B>", 12);
//        LicenseB smirnovAU = new LicenseB("Смирнов А.Ю.", "В/у кат.<B>", 22);
//        LicenseB artemovBI = new LicenseB("Артёмов Б.И.", "В/у кат.<B>", 14);
//        LicenseB samsonovIV = new LicenseB("Самсонов И.В.", "В/у кат.<B>", 9);
//
//        System.out.println(BodyType.COUPE);
//        System.out.println(ford);
//        System.out.println(volvo);
//        System.out.println(toyota);
//        System.out.println(volkswagen);
//        volkswagen.start();
//        volkswagen.finish();
//        volkswagen.bestLapTime();
//        volkswagen.maxSpeed();
//        volkswagen.pitStop();
//        System.out.println("Водитель " + ivanovOS.getFIO() + " управляет автомобилем " + volkswagen.getBrand() +" и будет участвовать в заезде");
//        volkswagen.getStartMessage(ivanovOS);
//        ford.printType();
//        volkswagen.printType();
//        samsonovIV.checkLicense();

        Truck kamaz = new Truck("Kamaz", "i750", 11.8, LoadCapasity.N2, "yes");
        Truck renault = new Truck("Renault", "Z400", 10.5, "yes");
        Truck daf = new Truck("DAF", "U12", 12.4, LoadCapasity.N3, "yes");
        Truck scania = new Truck("Scania", "DK46", 11.2, LoadCapasity.N2, "yes");
//
//        LicenseC costinUA = new LicenseC("Костин Ю.А.", "В/у кат.<C>", 19);
//        LicenseC livonovSM = new LicenseC("Ливонов С.М.", "В/у кат.<C>", 7);
//        LicenseC rimovSV = new LicenseC("Римов С.В.", "В/у кат.<C>", 16);
//        LicenseC chelovDA = new LicenseC("Челов Д.А.", "В/у кат.<C>", 8);
//
//        System.out.println(kamaz);
//        System.out.println(renault);
//        System.out.println(daf);
//        System.out.println(scania);
//        kamaz.printType();
//        renault.printType();
//        kamaz.getStartMessage(costinUA);

        Bus yutong = new Bus("Yutong", "ZK6129H", 14.00, Size.XS);
        Bus neoplan = new Bus("Neoplan", "N5218", 12.00,Size.XL);
        Bus maz = new Bus("Maz", "251", 10.00, Size.L);
        Bus liaz = new Bus("Liaz", "Cruiz", 12.00, Size.XL);
//
//        LicenseD markovFI = new LicenseD("Марков Ф.И.", "В/у кат.<D>", 11);
//        LicenseD socolovDB = new LicenseD("Соколов Д.В.", "В/у кат.<D>", 9);
//        LicenseD mironovSE = new LicenseD("Миронов С.Е.", "В/у кат.<D>", 22);
//        LicenseD grachevBA = new LicenseD("Грачёв Б.А.", "В/у кат.<D>", 17);
//
//        System.out.println(yutong);
//        System.out.println(neoplan);
//        System.out.println(maz);
//        System.out.println(liaz);
//        yutong.printType();
//        neoplan.printType();
//        grachevBA.checkLicense();

        PassengerCar[] passengerCars = new PassengerCar[]{volkswagen, volvo, ford, toyota};
        Truck[] trucks = new Truck[]{scania, kamaz, renault, daf};
        Bus[] buses = new Bus[]{yutong, neoplan, maz, liaz};

        for (PassengerCar passengerCar : passengerCars) {
            passengerCar.passDiagnostics();
        }

        for (Truck truck : trucks) {
            truck.passDiagnostics();
        }

        for (Bus bus : buses) {
            try {
                bus.passDiagnostics();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

//endregion

    }
}
