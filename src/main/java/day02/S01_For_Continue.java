package day02;

import java.util.Scanner;

public class S01_For_Continue {

    /*
      Kullanıcıdan 5 adet sayı isteyiniz
      Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
    */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int toplam=0;
        for (int i=1; i<6 ; i++){
            System.out.println("Lutfen "+i+ ". tam sayiyi giriniz");
            int sayi= input.nextInt();
            if (sayi>5 && sayi<10){
                continue;

            }else {
                toplam+=sayi;
            }

        }

        System.out.println("toplam = " + toplam);
        input.close();

    }

}
