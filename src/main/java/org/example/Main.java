package org.example;

public class Main {

    public static void main(String[] args) {


        //Task1

        Builder builder = new Builder("Іван", 35, "житлові будівлі");
        Sailor sailor = new Sailor("Петро", 28, "Мари");
        Pilot pilot = new Pilot("Марія", 30, "Боїнг 747");

        System.out.println("\nBuilder");
        builder.introduce();
        builder.build();

        System.out.println("\nSailor");
        sailor.introduce();
        sailor.sail();

        System.out.println("\nPilot");
        pilot.introduce();
        pilot.fly();


        //Task2

        Tiger tiger = new Tiger("Тигр", 40);
        Crocodile crocodile = new Crocodile("Крокодил", true);
        Kangaroo kangaroo = new Kangaroo("Кенгуру", 2.5);

        System.out.println("\nTiger");
        tiger.eat();
        tiger.roar();

        System.out.println("\nCrocodile");
        crocodile.eat();
        crocodile.swim();

        System.out.println("\nKangaroo");
        kangaroo.eat();
        kangaroo.jump();


        //Task3

        Money initialPrice = new Money(10, 50);
        Product product = new Product("Молоко", initialPrice);

        System.out.println("\nПочаткова інформація про продукт:");
        product.display();

        Money reduction = new Money(3, 30);
        product.reducePrice(reduction);

        System.out.println("\nІнформація про продукт після зменшення ціни:");
        product.display();


        //Task4


        Kettle kettle = new Kettle("Чайник", "Електричний чайник для кип'ятіння води.");
        Microwave microwave = new Microwave("Мікрохвильовка", "Пристрій для розігріву їжі.");
        Car car = new Car("Автомобіль", "Засіб пересування на дорозі.");
        Steamboat steamboat = new Steamboat("Пароплав", "Судно, яке працює на парі.");

        System.out.println("\nЧайник");
        kettle.Show();
        kettle.Sound();
        kettle.Desc();

        System.out.println("\nМікрохвильовка");
        microwave.Show();
        microwave.Sound();
        microwave.Desc();

        System.out.println("\nАвтомобіль");
        car.Show();
        car.Sound();
        car.Desc();

        System.out.println("\nПароплав");
        steamboat.Show();
        steamboat.Sound();
        steamboat.Desc();


        //Task6


        int[] numbers = {5, 12, 9, 3, 7};
        Array array = new Array(numbers);

        int max = array.Max();
        int min = array.Min();
        float avg = array.Avg();

        System.out.println("\nМаксимум: " + max);
        System.out.println("Мінімум: " + min);
        System.out.println("Середнє арифметичне: " + avg);
    }
}