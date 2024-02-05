package main.clients;

@FunctionalInterface
public interface Swimble {
    void swim();

    default double getSwimSpeed() {
        return 5;
    }

}