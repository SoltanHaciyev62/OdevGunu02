package hw2;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
  newSalary();

    }

    public static void newSalary() {
        Scanner scanner =  new Scanner(System.in);
        System.out.println(" Zam yapilacak Eleman Adi Giriniz");
        String Customer = scanner.next();
        System.out.println("Eleman Maasi Giriniz ");
        double CustomersSalary= scanner.nextDouble();

        System.out.println( CustomersSalary+= CustomersSalary * 0.2);



        System.out.println("Sayin"+ " " +Customer + "Maasiniza %20 zam yapilmistir"+" "+"Yeni maasiniz"+ CustomersSalary);
    }
}

