package transport;

import java.util.*;

import static transport.Size.*;

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

        PassengerCar<LicenseB> ford = new PassengerCar<>("Ford", "focus", 2.2, BodyType.HATCHBACK,"yes");
        PassengerCar<LicenseB> volvo = new PassengerCar<>("Volvo", "s90", 2.0, BodyType.SEDAN, "yes");
        PassengerCar<LicenseB> toyota = new PassengerCar<>("Toyota", "hilux", 2.5, BodyType.CROSSOVER,"yes");
        PassengerCar<LicenseB> volkswagen = new PassengerCar<>("Volkswagen", "polo", 2.0,
                BodyType.SEDAN, "yes");

        LicenseB ivanovOS = new LicenseB("Иванов О.С.", "В/у кат.<B>", 12);
        LicenseB smirnovAU = new LicenseB("Смирнов А.Ю.", "В/у кат.<B>", 22);
        LicenseB artemovBI = new LicenseB("Артёмов Б.И.", "В/у кат.<B>", 14);
        LicenseB samsonovIV = new LicenseB("Самсонов И.В.", "В/у кат.<B>", 9);
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

        Truck<LicenseC> kamaz = new Truck<>("Kamaz", "i750", 11.8, LoadCapasity.N2, "yes");
        Truck<LicenseC> renault = new Truck<>("Renault", "Z400", 10.5, LoadCapasity.N3, "yes");
        Truck<LicenseC> daf = new Truck<>("DAF", "U12", 12.4, LoadCapasity.N3, "yes");
        Truck<LicenseC> scania = new Truck<>("Scania", "DK46", 11.2, LoadCapasity.N2, "yes");

        LicenseC costinUA = new LicenseC("Костин Ю.А.", "В/у кат.<C>", 19);
        LicenseC livonovSM = new LicenseC("Ливонов С.М.", "В/у кат.<C>", 7);
        LicenseC rimovSV = new LicenseC("Римов С.В.", "В/у кат.<C>", 16);
        LicenseC chelovDA = new LicenseC("Челов Д.А.", "В/у кат.<C>", 8);
//
//        System.out.println(kamaz);
//        System.out.println(renault);
//        System.out.println(daf);
//        System.out.println(scania);
//        kamaz.printType();
//        renault.printType();
//        kamaz.getStartMessage(costinUA);

        Bus<LicenseD> yutong = new Bus<>("Yutong", "ZK6129H", 14.00, XS, "yes");
        Bus<LicenseD> neoplan = new Bus<>("Neoplan", "N5218", 12.00, XL, "yes");
        Bus<LicenseD> maz = new Bus<>("Maz", "251", 10.00, L, "yes");
        Bus<LicenseD> liaz = new Bus<>("Liaz", "Cruiz", 12.00, XL, "yes");

        LicenseD markovFI = new LicenseD("Марков Ф.И.", "В/у кат.<D>", 11);
        LicenseD socolovDB = new LicenseD("Соколов Д.В.", "В/у кат.<D>", 9);
        LicenseD mironovSE = new LicenseD("Миронов С.Е.", "В/у кат.<D>", 22);
        LicenseD grachevBA = new LicenseD("Грачёв Б.А.", "В/у кат.<D>", 17);
//
//        System.out.println(yutong);
//        System.out.println(neoplan);
//        System.out.println(maz);
//        System.out.println(liaz);
//        yutong.printType();
//        neoplan.printType();
//        grachevBA.checkLicense();

//        checkDiagnostics(volkswagen, volvo, ford, toyota, scania, kamaz, renault, daf, yutong, neoplan, maz, liaz);
//endregion

//regionКоллекции

        //regionTask1
        Mechanic<Car> tihanov = new Mechanic<>("Антон Тиханов", "Винтик&Шпунтик", Mechanic.Specialization.MECH_CAR);
        Mechanic<Car> comarov = new Mechanic<>("Сергей Комаров", "Ключ", Mechanic.Specialization.MECH_TRUCK);
        Mechanic<Car> pavlov = new Mechanic<>("Юрий Павлов", "СТО", Mechanic.Specialization.MECH_BUS);
        Mechanic<Car> fedorov = new Mechanic<>("Игорь Фёдоров", "Поршень", Mechanic.Specialization.MECH_CAR_TRUCK);
        Mechanic<Car> trotskiy = new Mechanic<>("Иван Троцкий", "Граж", Mechanic.Specialization.MECH_TRUCK_BUS);
        Mechanic<Car> somov = new Mechanic<>("Дмитрий Сомов", "СервисАвто", Mechanic.Specialization.MECH_UNIVERSAL);
        Mechanic<Car> domin = new Mechanic<>("Константин Домин", "Car&Bus", Mechanic.Specialization.MECH_CAR_BUS);

        Sponsor<Car> comfort = new Sponsor<>("Комфорт", 1_000_000);
        Sponsor<Car> layner = new Sponsor<>("Лайнер", 10_000_000);
        Sponsor<Car> prima = new Sponsor<>("Прима", 3_000_000);
        Sponsor<Car> invest = new Sponsor<>("Инвест", 7_000_000);
        Sponsor<Car> stroyavto = new Sponsor<>("СтройАвто", 14_000_000);
        Sponsor<Car> travel = new Sponsor<>("Тревел", 17_000_000);
        Sponsor<Car> start = new Sponsor<>("Старт", 12_000_000);
        Sponsor<Car> detal = new Sponsor<>("Деталь", 8_000_000);

//regionArrayListCar_Добавление_механиков_и_спонсоров
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(ford);
        cars.add(volvo);
        cars.add(toyota);
        cars.add(volkswagen);
        cars.add(kamaz);
        cars.add(renault);
        cars.add(daf);
        cars.add(scania);
        cars.add(yutong);
        cars.add(neoplan);
        cars.add(maz);
        cars.add(liaz);

        ford.getDrivers().add(ivanovOS);
        ford.getMechanics().add(tihanov);
        ford.getSponsors().add(comfort);

        volvo.getDrivers().add(smirnovAU);
        volvo.getMechanics().add(tihanov);
        volvo.getSponsors().add(comfort);

        toyota.getDrivers().add(artemovBI);
        toyota.getMechanics().add(fedorov);
        toyota.getSponsors().add(layner);

        volkswagen.getDrivers().add(samsonovIV);
        volkswagen.getMechanics().add(domin);
        volkswagen.getMechanics().add(somov);
        volkswagen.getSponsors().add(layner);

        kamaz.getDrivers().add(costinUA);
        kamaz.getMechanics().add(fedorov);
        kamaz.getSponsors().add(prima);

        renault.getDrivers().add(livonovSM);
        renault.getMechanics().add(trotskiy);
        renault.getSponsors().add(invest);

        daf.getDrivers().add(rimovSV);
        daf.getMechanics().add(comarov);
        daf.getSponsors().add(travel);

        scania.getDrivers().add(chelovDA);
        scania.getMechanics().add(comarov);
        scania.getMechanics().add(somov);
        scania.getSponsors().add(stroyavto);

        yutong.getDrivers().add(markovFI);
        yutong.getMechanics().add(pavlov);
        yutong.getSponsors().add(prima);

        neoplan.getDrivers().add(socolovDB);
        neoplan.getMechanics().add(trotskiy);
        neoplan.getSponsors().add(start);

        maz.getDrivers().add(mironovSE);
        maz.getMechanics().add(somov);
        maz.getSponsors().add(stroyavto);

        liaz.getDrivers().add(grachevBA);
        liaz.getMechanics().add(domin);
        liaz.getMechanics().add(somov);
        liaz.getSponsors().add(detal);


//        for (Car car : cars) {
//            System.out.println(car + "" + car.getMechanics() + "" + car.getSponsors());
//        }
        //endregion

        //endregion

        //regionTask2
        ServiceStation<Car> garage = new ServiceStation<>("Гараж");

        garage.addTransport(ford);
        garage.addTransport(volvo);
        garage.addTransport(toyota);
        garage.addTransport(volkswagen);
        garage.addTransport(kamaz);
        garage.addTransport(renault);
        garage.addTransport(daf);
        garage.addTransport(scania);

//        garage.doService();


        //endregion

//regionTaskHashMap

        HashMap<Car, Mechanic> carMechanicHashMap = new HashMap<>();
        carMechanicHashMap.put(ford, tihanov);
        carMechanicHashMap.put(volvo, fedorov);
        carMechanicHashMap.put(volvo, fedorov);
        carMechanicHashMap.put(volvo, fedorov);
        carMechanicHashMap.put(volvo, fedorov);
        carMechanicHashMap.put(volvo, fedorov);
        carMechanicHashMap.put(toyota, domin);
        carMechanicHashMap.put(volkswagen, somov);
        carMechanicHashMap.put(kamaz, fedorov);
        carMechanicHashMap.put(renault, trotskiy);
        carMechanicHashMap.put(daf, comarov);
        carMechanicHashMap.put(scania, somov);
        carMechanicHashMap.put(yutong, pavlov);
        carMechanicHashMap.put(neoplan, trotskiy);
        carMechanicHashMap.put(maz, somov);
        carMechanicHashMap.put(liaz, domin);

//        System.out.println(carMechanicHashMap);

        //endregionTaskHashMap

        //regoinTaskHashSet

        Set<Driver> driverHashSet = new HashSet<>();
        driverHashSet.add(ivanovOS);
        driverHashSet.add(smirnovAU);
        driverHashSet.add(artemovBI);
        driverHashSet.add(samsonovIV);
        driverHashSet.add(costinUA);
        driverHashSet.add(livonovSM);
        driverHashSet.add(rimovSV);
        driverHashSet.add(chelovDA);
        driverHashSet.add(markovFI);
        driverHashSet.add(socolovDB);
        driverHashSet.add(mironovSE);
        driverHashSet.add(grachevBA);
        driverHashSet.add(grachevBA);
        driverHashSet.add(grachevBA);
        driverHashSet.add(grachevBA);
        driverHashSet.add(grachevBA);
        driverHashSet.add(grachevBA);
        driverHashSet.add(grachevBA);
        driverHashSet.add(grachevBA);
        driverHashSet.add(grachevBA);

        for (Driver driver : driverHashSet) {
            System.out.println(driver);
        }


        //endregion





 //endregion







    }

//    public static void checkDiagnostics(Car... cars) {
//        for (Car car : cars) {
//            try {
//                car.passDiagnostics();
//            } catch (IllegalArgumentException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }






}
