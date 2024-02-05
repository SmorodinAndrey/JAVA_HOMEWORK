package main.Personal;

public abstract class Personal {
    private String name;
    private int age;

    public Personal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void work();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}