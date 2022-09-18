package findnumbers;

public class Main {
    public static void main(String[] args) {
        int[] sayılar = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15};
        int aranacak = 13;
        boolean varMı = false;
        int i;
        for (i = 0; i < 16; i++) {
            if (aranacak == sayılar[i]) {
                varMı = true;
                break;
            }
        }
        if (varMı) {
            System.out.println(aranacak + " sayısı var " + i + ". indexte bulunmaktadır.");
        } else {
            System.out.println("sayı bulunamadı.");
        }
    }
}
