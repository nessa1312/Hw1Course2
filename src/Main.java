public class Main {
    public static void main(String[] args) {
        int year = 2022;

        Human maxim = new Human(35, "Макси", "Минск", "бренд-менеджер");

        Human anna = new Human(29,"Аня", "Москва", "методист образовательных программ");

        Human katya = new Human(28, "Катя", "Калининград", "продакт-менеджер");

        Human artem = new Human(27, "Артем", "Москва", "директор по развитию бизнеса");

        System.out.println("Привет! Меня зовут " + maxim.name + ". Я из города " + maxim.city+ ". Я родился в "+(year - maxim.age)+" году. Я работаю на должности "+maxim.post+". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anna.name + ". Я из города " + anna.city+ ". Я родилась в "+(year - anna.age)+" году. Я работаю на должности "+anna.post+". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katya.name + ". Я из города " + katya.city+ ". Я родилась в "+(year - katya.age)+" году. Я работаю на должности "+katya.post+". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + ". Я из города " + artem.city+ ". Я родился в "+(year - artem.age)+" году. Я работаю на должности "+artem.post+". Будем знакомы!");

        Car lada = new Car("Lada","Grande", 1.7, "Желтый", 2015, "Россия");

        Car audi = new Car("Audi", "А8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия" );

        Car bmw = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия");

        Car kia = new Car("KIA", "Sportage 4 поколение", 2.4, "Красный", 2018, "Южная Корея");

        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");

        System.out.println("Марка: " + lada.brand+ ". Модель " +lada.model+ ". Объем двигателя в литрах: " +lada.engineVolume+ ". Цвет кузова: " +lada.color+ ". Год производства: " +lada.year+ ". Страна сборки: " + lada.country);
        System.out.println("Марка: " + audi.brand+ ". Модель " +audi.model+ ". Объем двигателя в литрах: " +audi.engineVolume+ ". Цвет кузова: " +audi.color+ ". Год производства: " +audi.year+ ". Страна сборки: " + audi.country);
        System.out.println("Марка: " + bmw.brand+ ". Модель " +bmw.model+ ". Объем двигателя в литрах: " +bmw.engineVolume+ ". Цвет кузова: " +bmw.color+ ". Год производства: " +bmw.year+ ". Страна сборки: " + bmw.country);
        System.out.println("Марка: " + kia.brand+ ". Модель " +kia.model+ ". Объем двигателя в литрах: " +kia.engineVolume+ ". Цвет кузова: " +kia.color+ ". Год производства: " +kia.year+ ". Страна сборки: " + kia.country);
        System.out.println("Марка: " + hyundai.brand+ ". Модель " +hyundai.model+ ". Объем двигателя в литрах: " +hyundai.engineVolume+ ". Цвет кузова: " +hyundai.color+ ". Год производства: " +hyundai.year+ ". Страна сборки: " + hyundai.country);
    }
}