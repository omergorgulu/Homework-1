package polymorphism;

public class ConsoleLogger extends BaseLogger{
    public void log(String message) {
        System.out.println("Konsola Loglandı " + message);
    }
}
