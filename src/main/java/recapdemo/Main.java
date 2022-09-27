package recapdemo;

public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int result = dortIslem.topla(6, 3);
        System.out.println(result);
        int result1 = dortIslem.carp(16, 22);
        System.out.println(result1);
        int result2 = dortIslem.cikar(144, 32);
        System.out.println(result2);
        int result3 = dortIslem.bol(22, 11);
        System.out.println(result3);
    }
}
