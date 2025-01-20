package main.java.monteur;

import java.util.ArrayList;
import java.util.Arrays;

public class Pizza {
    private final Name name;
    private final int size;
    private final Base base;
    private final Meat meat;
    private final ArrayList<Vegetable> vegetables;

    public Pizza(Name name, int size, Base base, Meat meat, ArrayList<Vegetable> vegetables) {
        this.name = name;
        this.size = size;
        this.base = base;
        this.meat = meat;
        this.vegetables = vegetables;
    }

    public Name getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public Base getBase() {
        return base;
    }

    public Meat getMeat() {
        return meat;
    }

    public ArrayList<Vegetable> getVegetables() {
        return vegetables;
    }

    @Override
    public String toString() {
        return "Pizza " +  name + ", de " + size + "cm, à base de " + base + ", avec du " + meat + " et " + vegetables;
    }
}
