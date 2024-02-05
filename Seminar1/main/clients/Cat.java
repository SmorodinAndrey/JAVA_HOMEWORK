package main.clients;

// import main.clients.Illness;
// import main.clients.Owner;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Huntable {

    public Cat() {
    }

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public static void meow() {
        System.out.println("Мяу");
    }

    public void toGo() {
        System.out.println("Животное ходит");
    }

    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eat'");
    }

    public static void add(Animal a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}