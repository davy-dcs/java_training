package main.java.monteur;

public class Director {


    public void bigCreamComplet(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.setName(Name.BIG_CREAM_COMPLET);
        pizzaBuilder.setSize(30);
        pizzaBuilder.setBase(Base.CREAM);
        pizzaBuilder.setMeat(Meat.CHICKEN);
        pizzaBuilder.setVegetables(Vegetable.ONION, Vegetable.MUSHROOM, Vegetable.BELL_PEPPER);
    }

    public void bigTomatoComplet(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.setName(Name.BIG_TOMATO_COMPLET);
        pizzaBuilder.setSize(30);
        pizzaBuilder.setBase(Base.TOMATO);
        pizzaBuilder.setMeat(Meat.BEEF);
        pizzaBuilder.setVegetables(Vegetable.ONION, Vegetable.MUSHROOM, Vegetable.BELL_PEPPER);
    }

    public void smallCreamComplet(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.setName(Name.SMALL_CREAM_COMPLET);
        pizzaBuilder.setSize(20);
        pizzaBuilder.setBase(Base.CREAM);
        pizzaBuilder.setMeat(Meat.CHICKEN);
        pizzaBuilder.setVegetables(Vegetable.ONION, Vegetable.MUSHROOM, Vegetable.BELL_PEPPER);
    }

    public void smallTomatoComplet(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.setName(Name.SMALL_TOMATO_COMPLET);
        pizzaBuilder.setSize(20);
        pizzaBuilder.setBase(Base.TOMATO);
        pizzaBuilder.setMeat(Meat.BEEF);
        pizzaBuilder.setVegetables(Vegetable.ONION, Vegetable.MUSHROOM, Vegetable.BELL_PEPPER);
    }
}
