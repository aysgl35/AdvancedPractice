package day04;

import java.util.Scanner;

public class S05_StringBuilder_FaktoriyelHesaplama {
    /*
        Bir öğrenci, matematik dersinde, verilen bir sayının faktöriyelini hesaplamak için bir program yazmak istiyor.
        Program, kullanıcıdan bir sayı girmesini isteyecek ve faktöriyel hesaplama işlemini gerçekleştirecektir.
        Kullanıcının girdiği sayı 20'den küçük veya eşit olacaktır.
        Faktöriyel hesaplama işlemi tamamlandıktan sonra sonucu ekrana yazdıracaktır.
    */

    public static void main(String[] args) {
        // 5! = 1 * 2 * 3 * 4 * 5 = 120
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz (20'ye eşit veya küçük olsun): ");
        int sayi = input.nextInt();

        if (sayi<=20){
            StringBuilder sonuc = new StringBuilder();
            sonuc.append(sayi).append("! = ");

            int faktoriyel = 1;
            for (int i = sayi; i > 0; i--) {
                sonuc.append(i);
                faktoriyel *= i;

                if (i != 1){
                    sonuc.append(" * ");
                }
            }
            sonuc.append(" = ").append(faktoriyel);
            System.out.println(sonuc);
        }else {
            System.out.println("Geçersiz değer girdiniz. 20'ye eşit veya küçük bir sayı girmelisiniz.");
        }


    input.close();
    }
}


