package main;

import main.clients.*;

import java.time.LocalDate;

public class Main {
        public static void main(String[] args) {

                Animal animal = new Animal("Солнышко", new Owner("Сергей Валерьевич"),
                                LocalDate.of(2021, 10, 05), new Illness("Лишай"));

                animal.walk();
                animal.fly();
                animal.swim();
                System.out.println();
                Animal cat = new Cat("Барсик", new Owner("Иванов Иван"),
                                LocalDate.of(2022, 1, 1), new Illness("Простуда"));

                cat.walk();
                cat.fly();
                cat.swim();

                System.out.println();

                Animal dog = new Dog("Бобик", new Owner("Петров Петр"),
                                LocalDate.of(2022, 3, 15), new Illness("Без проблем"));

                System.out.println();

                dog.walk();
                dog.fly();
                dog.swim();

                Animal fish = new Fish("Рыбка", new Owner("Иванов Василий"),
                                LocalDate.of(2020, 5, 22), new Illness("Без проблем"));

                System.out.println();

                fish.walk();
                fish.fly();
                fish.swim();

                Animal crow = new Crow("Ворона", new Owner("Сергеев Иван"),
                                LocalDate.of(2012, 1, 20), new Illness("Без проблем"));

                System.out.println();

                crow.walk();
                crow.fly();
                crow.swim();
        }

}