package practice05.s02_abstraction;

import practice05.s01_inheritance.KurumsalMusteri;

public class BilgisayarBilimleri extends Kurs {
    @Override
    public String kategoriAdi() {
        return "Bilgisayar";
    }

    @Override
    public String toString() {
        return "BilgisayarBilimleri{" +
                "\n\tDers Adi=" + dersAdi +
                "\n\tOgretmen Adi=" + ogretmenAdi +
                "\n\tDers Saati=" + dersSaati +
                "\n\tKurs Ucreti=" + kursUcreti +
                '}';
    }
}
