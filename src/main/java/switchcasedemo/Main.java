package switchcasedemo;

public class Main {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel: Geçtiniz");
                break;
            case 'B':
                System.out.println("Cok İyi: Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi: Geçtiniz");
                break;
            case 'D':
                System.out.println("İdare Eder: Geçtiniz");
                break;
            case 'F':
                System.out.println("Malesef Kaladınız.");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");

        }
    }
}
