package main.clients;

// import main.clients.Illness;
// import main.clients.Owner;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    @Override
    public void fly() {
        // Пустой метод
    }

    public void swim() {
        System.out.println("Животное плавает");
    }

    public void walk() {
        System.out.println("Животное ходит");
    }

    @Override
    public String getType() {
        return "Dog";
    }
}
