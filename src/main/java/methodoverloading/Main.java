package methodoverloading;

public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem= new DortIslem();
        System.out.println(dortIslem.add(5,6));
        dortIslem.add(13,24,65);
        System.out.println(dortIslem.add(21,23,67));
    }
}
