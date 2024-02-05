package main.Personal;

import main.clients.Animal;

public class Doctor extends Personal implements Operateable {
    public Doctor(String name, int age) {
        super(name, age);
    }

    public Doctor() {
        super("", 0);
    }

    @Override
    public void work() {
        System.out.println("Доктор работает");
    }

    @Override
    public void operate(Animal animal) {
        System.out.println("Doctor operates=");
    }

    public void printNameAndAge() {
        System.out.println("Имя: " + getName());
        System.out.println("Возраст: " + getAge());
    }

}
