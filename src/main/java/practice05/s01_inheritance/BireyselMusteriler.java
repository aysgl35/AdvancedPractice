package practice05.s01_inheritance;

import java.time.LocalDate;

public class BireyselMusteriler extends Musteri {
    String tcKimlikNo;
    LocalDate dogumTarihi;

    public BireyselMusteriler(String musteriAdi, int musteriNo, double hesapBakiyesi,String tcKimlikNo,LocalDate dogumTarihi) {
        super(musteriAdi, musteriNo, hesapBakiyesi);
       this.tcKimlikNo=tcKimlikNo;
       this.dogumTarihi=dogumTarihi;
    }

    @Override
    public String toString() {
        return "BireyselMusteriler{" +
                "\n"+super.toString()+
                "\n\tTC KimlikNo=\t" + tcKimlikNo +
                "\n\tDogum Tarihi=\t" + dogumTarihi ;

    }
    /*return "BireyselMusteriler{" +
                "tcKimlikNo='" + tcKimlikNo + '\'' +
                ", dogumTarihi=" + dogumTarihi +
                "} " + super.toString();  bu sekilde geldi biz duzenledik */
}
