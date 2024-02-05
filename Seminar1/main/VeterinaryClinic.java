package main;

import java.util.ArrayList;
import java.util.List;

// import main.Personal.Doctor;
import main.Personal.Personal;
// import main.Personal.Nurse;
import main.clients.Animal;
// import main.clients.Cat;
// import main.clients.Crow;
// import main.clients.Dog;
// import main.clients.Fish;
import main.clients.Flyble;
import main.clients.Goable;
// import main.clients.Bat;
import main.clients.Swimble;

public class VeterinaryClinic {

    private List<Animal> animals;
    private List<Goable> goableAnimals;
    private List<Flyble> flybleAnimals;
    private List<Swimble> swimbleAnimals;
    private List<Personal> personnel;

    public VeterinaryClinic() {
        animals = new ArrayList<>();
        goableAnimals = new ArrayList<>();
        flybleAnimals = new ArrayList<>();
        swimbleAnimals = new ArrayList<>();
        personnel = new ArrayList<>();
    }

    public void addAnimal(Animal a) {
        animals.add(a);
    }

    public void addGoable(Goable g) {
        goableAnimals.add(g);
    }

    public void addFlyable(Flyble f) {
        flybleAnimals.add(f);
    }

    public void addSwimble(Swimble s) {
        swimbleAnimals.add(s);
    }

    public void addPersonal(Personal p) {
        personnel.add(p);
    }

    public List<Goable> getAllGoableAnimals() {
        return goableAnimals;
    }

    public List<Flyble> getAllFlyableAnimals() {
        return flybleAnimals;
    }

    public List<Swimble> getAllSwimbleAnimals() {
        return swimbleAnimals;
    }

    public List<Personal> getAllPersonnel() {
        return personnel;
    }
}
