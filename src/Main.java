import Transport.Car;

public class Main {
    public static void main(String[] args) {
        int year = 2022;

        Human maxim = new Human(35, "Максим", "Минск", "бренд-менеджер");
        Human anna = new Human(29, "Аня", "Москва", "методист образовательных программ");
        Human katya = new Human(28, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(27, "Артем", "Москва", "директор по развитию бизнеса");
        Human vladimir = new Human(21, "Владимир", "Казань", null);

        printInfo(maxim);
        printInfo(anna);
        printInfo(katya);
        printInfo(artem);
        printInfo(vladimir);

        System.out.println();

        Car lada = new Car("Lada","Grande", 1.7, "Желтый", 2015, "Россия");
        lada.setRubber(false);
        Car audi = new Car("Audi", "А8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия" );
        Car bmw = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия");
        Car kia = new Car("KIA", "Sportage 4 поколение", 2.4, "Красный", 2018, "Южная Корея");
        kia.setRegistrationNumber("х123бв346");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");

        printCars(lada);
        printCars(audi);
        printCars(bmw);
        printCars(kia);
        printCars(hyundai);

        Flower rosa = new Flower(null, "Голландия", 35.59);
        Flower hrizantema = new Flower(null, null, 15, 5);
        Flower pion = new Flower(null, "Англия", 69.9, 1);
        Flower hypsofila = new Flower(null, "Турция", 19.5, 10);

        System.out.println();

        printFlowers(rosa);
        printFlowers(hrizantema);
        printFlowers(pion);
        printFlowers(hypsofila);

        System.out.println();

        printCostOfFlowers(
                rosa,rosa,rosa,hrizantema,hrizantema,hrizantema,hrizantema,hrizantema,hypsofila
        );
    }

    private static void printInfo(Human human) {
        System.out.println("Привет! Меня зовут " + human.name + ". Я из города " + human.getCity() + ". Я родился в " + human.getAge() + " году. Я работаю на должности " + human.post + ". Будем знакомы!");
    }

    private static void printFlowers (Flower flower){
        System.out.println("Цвет: " + flower.getFlowerColor()+ " Страна: " + flower.getCountry()+ " Цена за одну штуку: "+ flower.getCost()+ " Срок стояния: " + flower.lifeSpan+"");
    }

    private static double printCostOfFlowers (Flower... flowers){
        double totalCost = 0;
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower: flowers){
            if (flower.lifeSpan<minLifeSpan){
                minLifeSpan=flower.lifeSpan;
            }
            totalCost+=flower.getCost();
            printFlowers(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета: " + totalCost);
        System.out.println("Срок стояния букета: " + minLifeSpan);
        return totalCost;
    }

    private static void printCars (Car car){
        System.out.println("Марка: " + car.getBrand()+
                ". Модель " +car.getModel()+
                ". Объем двигателя в литрах: " +car.getEngineVolume()+
                ". Цвет кузова: " +car.getColor()+
                ". Год производства: " +car.getYear()+
                ". Страна сборки: " + car.getCountry() +
                ". Коробка передач: " + car.getTransmission() +
                ". Тип кузова: " + car.getBodyType() +
                ". Регистрационный номер: " + car.getRegistrationNumber() +
                ". Количество мест: " + car.getSeatsCount() +
                ". Резина: " + ((car.isRubber())? "летняя" : "зимняя"));
    }
}
