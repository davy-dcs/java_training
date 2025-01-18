package singleton;

public final class Singleton {
    private static Singleton instance;
    private final String value;
    private String message;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) instance = new Singleton(value);
        return instance;
    }

    public String getValue(){
        return value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
