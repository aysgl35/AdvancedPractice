package practice05.s01_inheritance;

import java.time.LocalDate;

public class BankaYonetimSistemi {
    public static void main(String[] args) {
        LocalDate dogumTarihi=LocalDate.of(1985,03,16);
        BireyselMusteriler bm1=new BireyselMusteriler(
                "Ali",
                12345,
                12.300,
                "12345678",
                dogumTarihi);
        System.out.println(bm1);
        System.out.println("--------------------------------------");
        KurumsalMusteri km1=new KurumsalMusteri(
                "Ahmet Yilmaz",
                1234578,
                10000,
                "23467589",
                "TechPro Education");
        System.out.println(km1);
        km1.paraYatirma(8000);
    }
}
