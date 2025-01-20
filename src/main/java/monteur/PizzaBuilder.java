package main.java.monteur;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaBuilder implements Builder {
    private Name name;
    private int size;
    private Base base;
    private Meat meat;
    private ArrayList<Vegetable> vegetables = new ArrayList<>();

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void setBase(Base base) {
        this.base = base;
    }

    @Override
    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    @Override
    public void setVegetables(Vegetable... vegetables) {
        this.vegetables.addAll(Arrays.asList(vegetables));
    }

    public Pizza getResult() {
        Pizza pizza = new Pizza(name, size, base, meat, vegetables);
        this.vegetables = new ArrayList<>();
        return pizza;
    }
}
