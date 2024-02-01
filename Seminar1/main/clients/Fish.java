package main.clients;

// import main.clients.Illness;
// import main.clients.Owner;

import java.time.LocalDate;

public class Fish extends Animal {
    public Fish() {
    }

    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    @Override
    public void walk() {
        // Пустой метод
    }

    public void swim() {
        System.out.println("Животное плавает");
    }

    @Override
    public void fly() {
        // Пустой метод
    }

    @Override
    public String getType() {
        return "Fish";
    }
}
