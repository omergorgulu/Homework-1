package arrays;

public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Ömer";
        String ogrenci2 = "Göktuğ";
        String ogrenci3 = "Kerem";
        String ogrenci4 = "Tuğba";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-------------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Ömer";
        ogrenciler[1] = "Göktuğ";
        ogrenciler[2] = "Kerem";
        ogrenciler[3] = "Tuğba";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("-------------------------");

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);

        }
    }
}
