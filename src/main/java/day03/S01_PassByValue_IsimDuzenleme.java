package day03;

import java.util.Locale;

public class S01_PassByValue_IsimDuzenleme {
    public static void main(String[] args) {
         /*
        String içinde verilmiş bir ismin orjinal değerini değiştirmeden aşağıdaki işlemleri yapan metotlar yazın.
            String isim = "Ali Veli Can";
            - Tüm harleri büyük yapın.
            - Tüm harfleri küçük yapın.
            - İsmin başına ünvan ekleyin.
            - Sadece ilk isim ve soyismi yazın ve orta ismi kısaltarak yazın (Örnek: Ali V. Can)
            - İsmin sadece ilk harflerini büyük, soyismin tamamını büyük harfle yazın.
            */

        String isim = "Ali Veli CAn";
        System.out.println(isim);
        tumuBuyuk(isim);
        System.out.println(isim);
        tumuBuyuk("Aysegul");
        tumuKucuk(isim);
        tumuKucuk("BarniKus");
        unvanEkle("Dr.", isim);

    }

    public static void tumuBuyuk(String deger) {
        deger = deger.toUpperCase();
        System.out.println(deger);
    }

    public static void tumuKucuk(String deger) {
        deger = deger.toLowerCase();
        System.out.println(deger);
    }
    public static void unvanEkle(String unvan, String deger) {

       deger = unvan+" "+ deger;
        System.out.println(deger);
    }
}