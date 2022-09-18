package strings;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün mükemmel bir hava var.";

        System.out.println(mesaj);
        System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("7. eleman : " + mesaj.charAt(6));
        System.out.println(mesaj.concat("Harika"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));

        char[] karaketerler = new char[5];
        mesaj.getChars(0, 5, karaketerler, 0);
        System.out.println(karaketerler);
        System.out.println(mesaj.indexOf("ün"));
        System.out.println(mesaj.lastIndexOf('h'));
        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2, 4));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
}
