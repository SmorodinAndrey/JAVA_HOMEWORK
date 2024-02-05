package main.clients;

// import main.clients.Illness;
// import main.clients.Owner;

import java.time.LocalDate;

public class Fish extends Animal implements Swimble, Goable, Flyble {
    public Fish() {
    }

    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
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

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eat'");
    }

    public static void add(Animal a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void toGo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toGo'");
    }
}
