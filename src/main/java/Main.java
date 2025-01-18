import singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton premiereInstance = Singleton.getInstance("Première instance");
        premiereInstance.setMessage("Je suis la première instance.");

        System.out.println("Première instance : " + premiereInstance.getValue());
        System.out.println("Message première instance : " + premiereInstance.getMessage());

        Singleton deuxiemeInstance = Singleton.getInstance("Deuxième instance");
        deuxiemeInstance.setMessage("Je suis la deuxième instance");

        System.out.println("Deuxième instance : " + deuxiemeInstance.getValue());
        System.out.println("Message deuxième instance : " + deuxiemeInstance.getMessage());
    }
}
