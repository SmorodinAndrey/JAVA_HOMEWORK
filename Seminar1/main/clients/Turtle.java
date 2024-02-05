package main.clients;

// import main.clients.Illness;
// import main.clients.Owner;

import java.time.LocalDate;

public class Turtle extends Animal implements Goable, Huntable, Swimble {

    public Turtle() {
    }

    public Turtle(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public void swim() {
        System.out.println("Животное плавает");
    }

    public void toGo() {
        System.out.println("Животное ходит");
    }

    @Override
    public String getType() {
        return "Turtle";
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eat'");
    }
}
