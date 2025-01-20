package main.java;

import main.java.monteur.Director;
import main.java.monteur.Pizza;
import main.java.monteur.PizzaBuilder;
import main.java.prototype.Circle;
import main.java.prototype.Rectangle;
import main.java.prototype.Shape;
import singleton.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Singleton
        Singleton premiereInstance = Singleton.getInstance("Première instance");
        premiereInstance.setMessage("Je suis la première instance.");

        System.out.println("Première instance : " + premiereInstance.getValue());
        System.out.println("Message première instance : " + premiereInstance.getMessage());

        Singleton deuxiemeInstance = Singleton.getInstance("Deuxième instance");
        deuxiemeInstance.setMessage("Je suis la deuxième instance");

        System.out.println("Deuxième instance : " + deuxiemeInstance.getValue());
        System.out.println("Message deuxième instance : " + deuxiemeInstance.getMessage());

        // Prototype
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCloned = new ArrayList<>();

        Circle c1 = new Circle("Blue", 10, 10);
        c1.setRadius(15);
        shapes.add(c1);

        Circle c2 = new Circle("Red", 30, 40, 50);
        shapes.add(c2);

        Rectangle r1 = new Rectangle("Orange", 10, 5, 10, 5);
        shapes.add(r1);

        Rectangle r2 = new Rectangle("Yellow", 20, 10, 20, 15);
        shapes.add(r2);

        for (Shape shape : shapes) {
            shapesCloned.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCloned.get(i)) {
                System.out.println(i + ": L'object d'origine et son clone sont des objets différents.");
                if (shapes.get(i).equals(shapesCloned.get(i))) {
                    System.out.println(i + ": Et ils sont identiques.");
                } else {
                    System.out.println(i + ": Mais ils ne sont pas identiques.");
                }
            } else {
                System.out.println(i + ": L'object d'origine et son clone sont le même objet.");
            }
        }

        // Monteur
        Director pizzaiolo = new Director();
        PizzaBuilder pizzaBuilder = new PizzaBuilder();

        pizzaiolo.bigCreamComplet(pizzaBuilder);
        Pizza pizza1 = pizzaBuilder.getResult();

        pizzaiolo.bigTomatoComplet(pizzaBuilder);
        Pizza pizza2 = pizzaBuilder.getResult();

        pizzaiolo.smallCreamComplet(pizzaBuilder);
        Pizza pizza3 = pizzaBuilder.getResult();

        pizzaiolo.smallTomatoComplet(pizzaBuilder);
        Pizza pizza4 = pizzaBuilder.getResult();

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
        System.out.println(pizza4);
    }
}
