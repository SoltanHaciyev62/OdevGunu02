package hw3;

public class ParametreliMetodlar {
    public static void main(String[] args) {
        System.out.println(topla(5, 7));
        System.out.println(cikar(7, 5));
        System.out.println(carp(9, 8));
        System.out.println(bol(10, 2));
        System.out.println(hepsinTopla(2,5,8,9,6,4,7));
    }

    public static int topla(int n, int m) {
        return n + m;
    }

    public static int cikar(int n, int m) {
        return n - m;
    }

    public static int carp(int n, int m) {
        return n * m;
    }

    public static int bol(int n, int m) {
        return n / m;
    }
// variable Argumets
    public static int hepsinTopla(int... sayilar) {

        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

}
