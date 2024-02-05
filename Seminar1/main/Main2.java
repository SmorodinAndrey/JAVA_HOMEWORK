package main;

import main.Personal.Doctor;
import main.Personal.Nurse;
import main.Personal.Personal;
import main.clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Goable> goableAnimals = new ArrayList<>();
        Cat cat = new Cat("Мурзик", new Owner("Иванов"), LocalDate.now(), new Illness("Нет проблем"));
        Dog dog = new Dog("Бобик", new Owner("Петров"), LocalDate.now(), new Illness("Нет проблем"));
        Turtle Turtle = new Turtle("Бобик", new Owner("Петров"), LocalDate.now(), new Illness("Нет проблем"));
        goableAnimals.add(cat);
        goableAnimals.add(dog);
        goableAnimals.add(Turtle);

        for (Goable animal : goableAnimals) {
            animal.toGo();
        }

        List<Flyble> flybleAnimals = new ArrayList<>();
        Crow eagle = new Crow("Орел", new Owner("Сергеев Иван"), LocalDate.of(2012, 1, 20),
                new Illness("Нет проблем"));
        Bat pigeon = new Bat("Летучая мышь", new Owner("Кузнецов"), LocalDate.now(), new Illness("Нет проблем"));
        flybleAnimals.add(eagle);
        flybleAnimals.add(pigeon);

        for (Flyble animal : flybleAnimals) {
            animal.fly();
        }

        List<Swimble> swimbleAnimals = new ArrayList<>();
        Fish fish = new Fish("Золотая рыбка", new Owner("Сидоров"), LocalDate.now(), new Illness("Нет проблем"));
        swimbleAnimals.add(fish);

        for (Swimble animal : swimbleAnimals) {
            animal.swim();
        }

        VeterinaryClinic veterinaryClinic = new VeterinaryClinic();
        List<Personal> personalList = new ArrayList<>();
        Doctor doctor1 = new Doctor("Иванов", 35);
        Doctor doctor2 = new Doctor("Петров", 40);
        doctor1.printNameAndAge();

        Nurse nurse1 = new Nurse("Иванова", 26);
        nurse1.printNameAndAge();
    }
}
