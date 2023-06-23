package practice05.s02_abstraction;

public class UniversiteYonetimSistemi {
    public static void main(String[] args) {
    Kurs bm=new BilgisayarBilimleri();//constructor kendi classini getirir
    bm.dersAdi="Temel Bilgisayar-1";
        System.out.println(bm);
        System.out.println(bm.kategoriAdi());
        /*
        BilgisayarBilimleri{
	Ders Adi=Temel Bilgisayar-1
	Ogretmen Adi=null
	Ders Saati=0
	Kurs Ucreti=0.0}
Bilgisayar

         */
        Isletme isletme=new Isletme();
        System.out.println(isletme.kategoriAdi());//Isletme
    }
}
