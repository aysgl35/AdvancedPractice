package practice05.s02_abstraction;

public class Isletme extends Kurs {
    @Override
    public String kategoriAdi() {
        return "Isletme";
    }

    @Override
    public String toString() {
        return "İsletme{" +
                "\n\tDers Adi=" + dersAdi +
                "\n\tOgretmen Adi=" + ogretmenAdi +
                "\n\tDers Saati=" + dersSaati +
                "\n\tKurs Ucreti=" + kursUcreti +
                '}';
    }
}
