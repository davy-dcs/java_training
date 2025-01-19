import prototype.Circle;
import prototype.Rectangle;
import prototype.Shape;
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
    }
}
