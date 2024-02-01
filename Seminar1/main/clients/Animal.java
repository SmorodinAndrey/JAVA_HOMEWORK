package main.clients;

// import main.clients.Illness;
// import main.clients.Owner;

import java.time.LocalDate;

public class Animal {
    private String nickName;
    private Owner owner;
    private LocalDate birthDate;
    private Illness illness;

    public Animal() {
    }

    public Animal(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        this.nickName = nickName;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public void fly() {
        // Пустой метод
    }

    public void swim() {
        // Пустой метод
    }

    public void walk() {
        // Пустой метод
    }

    public void lifeCycle() {
        System.out.println("Родился");
        System.out.println("Рос");
        System.out.println("Умер");
    }

    public String getType() {
        return "Unknown Animal";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nickName='" + nickName + '\'' +
                ", owner=" + owner +
                ", birthDate=" + birthDate +
                ", illness=" + illness +
                '}';
    }
}
