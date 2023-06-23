package day04;

import java.util.Formatter;

public class S04_Varargs_RestoranVBen {
    /*
        Java programında, bir restoranın menüsündeki yemeklerin fiyatlarını hesaplayan bir metot yazmanız isteniyor.
        Metot, menüdeki yemeklerin isimlerini ve ardından fiyatlarını almalıdır.
        Menüdeki yemeklerin fiyatları toplamını döndüren ve menüye hiç yemek eklenmediğinde 0 döndüren bir metot yazın.
    */

    public static void main(String[] args) {

    double toplam=  toplamFiyat("Corba","15.15","Salata","22.25","Pide","35.95");
        System.out.println("toplam: "+ toplam);

    }



    public static double toplamFiyat(String... yemekler){
        double toplam=0;
        System.out.println("Hos geldiniz\n*************************");
        for (int i = 0; i < yemekler.length ; i+=2) {
            String yemek=yemekler[i];
           double yemekFiyati= Double.parseDouble(yemekler[i+1]);
           toplam+=yemekFiyati;


            System.out.println(yemek+  " \t = "+ yemekFiyati+ " TL ");

        }
        System.out.println("------------------------------------------");


        return toplam;
    }
}