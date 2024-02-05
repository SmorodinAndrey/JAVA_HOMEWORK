package main.clients;

// import main.clients.Illness;
// import main.clients.Owner;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Huntable, Swimble {

    public Dog() {
    }

    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
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
        return "Dog";
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
