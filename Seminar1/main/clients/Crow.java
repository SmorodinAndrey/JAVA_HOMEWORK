package main.clients;

// import main.clients.Illness;
// import main.clients.Owner;

import java.time.LocalDate;

public class Crow extends Animal {
    public Crow() {
    }

    public Crow(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    @Override
    public void swim() {
        // Пустой метод
    }

    public void fly() {
        System.out.println("Животное летает");
    }

    public void walk() {
        System.out.println("Животное ходит");
    }

    @Override
    public String getType() {
        return "Crow";
    }
}
