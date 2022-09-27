package polymorphism;

public class EmailLogger extends BaseLogger{
    public void log(String message) {
        System.out.println("Mail olarak loglandı " + message);
    }
}
