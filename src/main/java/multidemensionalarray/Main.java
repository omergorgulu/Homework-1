package multidemensionalarray;

public class Main {
    public static void main(String[] args) {
        String[][] sehir = new String[3][3];

        sehir[0][0] = "İstanbul";
        sehir[0][1] = "Aksaray";
        sehir[0][2] = "Mardin";
        sehir[1][0] = "Muğla";
        sehir[1][1] = "Sakarya";
        sehir[1][2] = "Malatya";
        sehir[2][0] = "Düzce";
        sehir[2][1] = "Şırnak";
        sehir[2][2] = "Van";

        for (int i = 0; i <= 2; i++) {
            System.out.println("----------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehir[i][j]);
            }
        }
    }
}
