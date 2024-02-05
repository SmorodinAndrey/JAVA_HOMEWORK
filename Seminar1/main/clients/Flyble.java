package main.clients;

@FunctionalInterface
public interface Flyble {
    void fly();

    default double getFlySpeed() {
        return 20;
    }

}