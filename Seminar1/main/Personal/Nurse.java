package main.Personal;

public class Nurse extends Personal implements Careable {
    public Nurse(String name, int age) {
        super(name, age);
    }

    public Nurse() {
        super("", 0);
    }

    @Override
    public void work() {
        System.out.println("Медсестра работает");
    }

    @Override
    public void takeCare() {
        System.out.println("Nurse taking care of patient");
    }

    public void printNameAndAge() {
        System.out.println("Имя: " + getName());
        System.out.println("Возраст: " + getAge());
    }

}
