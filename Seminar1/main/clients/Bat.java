package main.clients;

// import main.clients.Illness;
// import main.clients.Owner;

import java.time.LocalDate;

public class Bat extends Animal implements Goable, Huntable, Swimble, Flyble {
    public Bat() {
    }

    public Bat(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    @Override
    public void swim() {
        // Пустой метод
    }

    public void fly() {
        System.out.println("Животное летает");
    }

    public void toGo() {
        System.out.println("Животное ходит");
    }

    @Override
    public String getType() {
        return "Bat";
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eat'");
    }

}
