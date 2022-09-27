package methods2;

public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        String newMessage = message.substring(2, 5);
        System.out.println(newMessage);
        System.out.println(sehirVer());
        int number = topla(15, 33);

        System.out.println(number);

        int total = topla2(22, 33, 67, 87, 89);

        System.out.println(total);
    }

    public static void add() {
        System.out.println("Eklendi.");
    }

    public static void delete() {
        System.out.println("Silindi.");
    }

    public static void update() {
        System.out.println("Güncellendi.");
    }

    public static int topla(int number1, int number2) {
        return number1 + number2;
    }

    //int... veriable arguments
    //int array gönderilmiş gibi olur.
    public static int topla2(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static String sehirVer() {
        return "Paris";
    }
}
