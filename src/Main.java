import com.sun.jdi.connect.Transport;

import java.util.*;
import java.util.Queue;
import java.util.Random;


public class Main {


    public static void main(String[] args) {
        //ДЗ ,
        Mechanic<Car> ann = new Mechanic<Car>("Анна", "NewUnited", "Легковые_авто");
        Mechanic<CargoCar> vano = new Mechanic<>("Vano", "NewUnited", "Грузовые_авто");
        Mechanic<Bus> robert = new Mechanic<>("robert", "NewUnited", "Автобусы_авто");

        Sponsor gazprom = new Sponsor("ГазПром", 3_000_000);
        Sponsor tinkoff = new Sponsor("Тинькофф", 6_000_000);

        Car lada = new Car("lada","Granta",1.7);
        lada.addDriver(new DriverB("Вася",2, lada));
        DriverB driverB = new DriverB("Вася",2, lada);
        dataCar(lada, driverB, ann, gazprom);
        lada.addDriver(driverB);
        lada.addMechanic(ann);
        lada.addSponsor(gazprom, tinkoff);

        Car kia = new Car("kia","Sportage", 2.4);
        DriverB driverB2 = new DriverB("Коля",3, kia);
        dataCar2(kia, driverB2, ann, gazprom);
        kia.addDriver(new DriverB("Коля",3, kia));
        kia.addMechanic(ann);
        kia.addSponsor(gazprom, tinkoff);


        Bus ferrari = new Bus("ferrari", "F-500", 3.4);
        DriverD driverD = new DriverD("Маша",5, ferrari);
        dataCar3(ferrari, driverD, robert, gazprom);
        ferrari.addDriver(new DriverD("Маша",10, ferrari));
        ferrari.addMechanic(robert);
        ferrari.addSponsor(gazprom, tinkoff);

        CargoCar mercedes = new CargoCar("mercedes", "SCLK", 4.1);
        DriverC driverC = new DriverC("Даша",10, mercedes);
        dataCar4(mercedes, driverC, vano, tinkoff);
        mercedes.addDriver(new DriverC("Даша",10, mercedes));
        mercedes.addMechanic(vano);
        mercedes.addSponsor(gazprom, tinkoff);


        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(lada);
        serviceStation.addCargoCar(mercedes);
        serviceStation.service();
        serviceStation.service();

        //ДЗ 3-1
        SponsorList sponsorList = new SponsorList();
        sponsorList.addSponsor(gazprom);
        sponsorList.addSponsor(gazprom);
        sponsorList.addSponsor(tinkoff);
        System.out.println(sponsorList);


        MechanicList mechanicList = new MechanicList();
        mechanicList.addMechanic(ann);
        mechanicList.addMechanic(vano);
        mechanicList.addMechanic(vano);
        mechanicList.addMechanic(robert);
        System.out.println(mechanicList);

        DriverList driverList = new DriverList();
        driverList.addDriver(driverB);
        driverList.addDriver(driverC);
        driverList.addDriver(driverC);
        driverList.addDriver(driverD);
        System.out.println(driverList);

         //Задание 1
        Product ba = new Product("banana", 70, 2);
        Product ba1 = new Product("banana", 60, 3);
        Product or = new Product("orange", 170, 3);
        Product ap = new Product("apple", 50, 1);
        Product ch = new Product("cherry", 240, 4);

        ProductList productList = new ProductList();
        productList.addProduct(ba);
        //  productList.addProduct(ba1);
        productList.addProduct(or);
        productList.addProduct(ap);
        productList.addProduct(ch);
        System.out.println(productList);

        //Задание 2-1
        Recipe re1 = new Recipe("Рецепт-1", productList.getProducts());
        RecipeList recipeList = new  RecipeList();
        recipeList.addRecipe(re1);
        System.out.println(recipeList);

        //Задание 2-2
        numberSet();

        //Задание 3-2
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.println(multiplicationTable);

        //Задание 3-3
        Passport an = new Passport(1, "Ivanova", "Ann", "Platonovna",2002);
        //  System.out.println(an);
        Passport ivan = new Passport(2, "Petrov", "Ivan", "Vasilievich",1999);
        // System.out.println(ivan);
        PassportList passportList = new PassportList();
        passportList.addOrUpdatePassport(an);
        passportList.addOrUpdatePassport(ivan);
        System.out.println(passportList);
        System.out.println(passportList.finalByNumber(1));
        System.out.println(passportList.finalByNumber(3));

        //Задание 3-4
        /*
        Для поиска элементов списка больших данных лучше использовать список HashSet, так как
        это множество,которое анализирует хеш-код нашего элемента, в зависимости от него выбирает
         нужную ячейку в массиве и укладывает туда элемент, что позволяет совершать поиск
         за константное время, в то время как ArrayList и LinkedList для этой задачи необходимо
         итерировать элементы своей коллекции через цикл, что для поиска элементов добавляет
          сложность порядка n.
         */





    }

    private static void dataCar(Car lada, DriverB driverB, Mechanic ann, Sponsor gazprom) {
        System.out.print("\n");
        System.out.println(driverB);
        System.out.println(lada);
        System.out.println(ann);
        System.out.println(gazprom);
    }

    public  static void dataCar2(Car kia, DriverB driverB2, Mechanic ann, Sponsor gazprom) {
        System.out.print("\n");
        System.out.println(driverB2);
        System.out.println(kia);
        System.out.println(ann);
        System.out.println(gazprom);
    }

    private static void dataCar3(Bus ferrari, DriverD driverD, Mechanic robert, Sponsor gazprom) {
        System.out.print("\n");
        System.out.println(driverD);
        System.out.println(ferrari);
        System.out.println(robert);
        System.out.println(gazprom);
    }

    private static void dataCar4(CargoCar mercedes, DriverC driverC, Mechanic vano, Sponsor tinkoff) {
        System.out.print("\n");
        System.out.println(driverC);
        System.out.println(mercedes);
        System.out.println(vano);
        System.out.println(tinkoff);
    }

    public static void numberSet() {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(0, 1000));
        }
        System.out.println(numbers);
        Iterator<Integer> iterator= numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }

}