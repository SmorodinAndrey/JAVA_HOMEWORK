package main.drugstore;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

public class Pharmacy implements Comparable<Pharmacy> {
    private String name;
    private double weight;
    private int power;

    public Pharmacy(String name, double weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    @Override
    public int compareTo(Pharmacy o) {
        return Integer.compare(power, o.power);
    }
}

// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.List;

// public class Pharmacy implements Iterator<Component> {
// private List<Component> components = new ArrayList<>();
// private int index = 0;

// public void addComponents(Component ... components) {
// for(Component c : components){
// this.components.add(c);
// }
// }

// @Override
// public boolean hasNext() {
// return index < components.size();
// }

// @Override
// public Component next() {
// return components.get(index++);
// }
// }