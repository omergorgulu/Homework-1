package recapdemo1;

public class Main {
    public static void main(String[] args) {
        int sayi1 = 30;
        int sayi2 = 25;
        int sayi3 = 40;

        if (sayi1 > sayi2 & sayi1 > sayi3) {
            System.out.println("Büyük Sayı :" + sayi1);
        } else if (sayi2 > sayi1 & sayi2 > sayi3) {
            System.out.println("Büyük Sayı :" + sayi2);
        } else {
            System.out.println("Büyük Sayı :" + sayi3);
        }
    }
}
