package main.drugstore;

import main.drugstore.components.Azitronite;
import main.drugstore.components.Penicillin;
import main.drugstore.components.Water;

import java.util.*;

public class Drugmain {

    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitronite", 2D, 14);
        Component penicillin = new Penicillin("penicillin", 1.6D, 6);

        PharmacyTwo p1 = new PharmacyTwo();
        p1.addComponents(water, azitronite);

        PharmacyTwo p2 = new PharmacyTwo();
        p2.addComponents(penicillin, water);

        PharmacyTwo p3 = new PharmacyTwo();
        p3.addComponents(azitronite, penicillin);

        List<Component> components = new ArrayList<>();

        components.add(azitronite);
        components.add(water);
        components.add(penicillin);

        System.out.println(components);

        Collections.sort(components, Comparator.reverseOrder());
        System.out.println(components);

        Collections.sort(components, Comparator.reverseOrder());
        System.out.println(components);

        List<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(new Pharmacy("Vaselinum", 9.2, 1));
        pharmacies.add(new Pharmacy("Aethazolum", 3.7, 9));
        pharmacies.add(new Pharmacy("Baralgin", 11.1, 3));

        Collections.sort(pharmacies, Comparator.comparingDouble(Pharmacy::getPower));

        for (Pharmacy p : pharmacies) {
            System.out.println(p.getName() + ": " + p.getPower());
        }

        // Iterator<Component> iterator = p1;
        // while (iterator.hasNext()) {
        // System.out.println(p1.next().toString());
        // }

        // for (Component c : p2) {
        // System.out.println(c);
        // }

    }
}