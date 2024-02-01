package main.clients;

// import main.clients.Illness;
// import main.clients.Owner;

import java.time.LocalDate;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public static void meow() {
        System.out.println("Мяу");
    }

    public void walk() {
        System.out.println("Животное ходит");
    }

    @Override
    public void fly() {
        // Пустой метод
    }

    @Override
    public void swim() {
        // Пустой метод
    }

    @Override
    public String getType() {
        return "Cat";
    }
}