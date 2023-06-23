package practice05.s01_inheritance;

import java.time.LocalDate;

public class Musteri {
    String musteriAdi;
    int musteriNo;
    double hesapBakiyesi;

    @Override
    public String toString() {
        return
                "\n\tMusteriAdi=\t" + musteriAdi +
                "\n\tMusteriNo=\t" + musteriNo +
                "\n\tHesap Bakiyesi=\t" + hesapBakiyesi ;

    }

    public void paraCekme(double para) {
        if (hesapBakiyesi >= para) {
            hesapBakiyesi -= para;
            System.out.println("Hesabinazdan" + para + "TL cekilmistir.");
            System.out.println("Yeni bakiyeniz: " + hesapBakiyesi + " TL'dir");
        } else {
            System.out.println("Hesabinizda yeterli bakiyeniz bulunmamaktadir");
        }
    }

    public void paraYatirma(double para) {
        hesapBakiyesi += para;
        System.out.println("Hesabinaza" + para + "TL yatirilmistir.");
        System.out.println("Yeni bakiyeniz: " + hesapBakiyesi + " TL'dir");
    }

    public Musteri(String musteriAdi, int musteriNo, double hesapBakiyesi) {
        this.musteriAdi = musteriAdi;
        this.musteriNo = musteriNo;
        this.hesapBakiyesi = hesapBakiyesi;
    }
}

