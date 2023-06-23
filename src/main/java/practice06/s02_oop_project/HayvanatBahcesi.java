package practice06.s02_oop_project;

import java.util.ArrayList;
import java.util.List;

public class HayvanatBahcesi {
    private static List<Hayvan> hayvanlar = new ArrayList<>();
    private List<Ziyaretci> ziyaretciler = new ArrayList<>();

    public static void hayvanEkle(Hayvan hayvan){
        hayvanlar.add(hayvan);

    }
    public void ziyaretciEkle(Ziyaretci ziyaretci){
        ziyaretciler.add(ziyaretci);

    }
    public void hayvanListele(){
        System.out.println("HAYVANLAR LİSTESİ :\n--------------------------------------");
        for (Hayvan hayvan:hayvanlar) {
            System.out.println("Ad: "+hayvan.getAd());
            System.out.println("Yas: "+hayvan.getYas());
            System.out.println("Tur: "+hayvan.getTur());
            System.out.println("---------------------------------");
           // System.out.println(hayvan);
        }

    }
    public void hayvanTablola(){
        //-10 karakter sayisi
        System.out.printf("%-10s %-10s %-10s %n","Ad","Yas","Tur");
        System.out.println("--------------------------------");
        for (Hayvan hayvan:hayvanlar){
            System.out.printf("%-10s %-10s %-10s %n",
                    hayvan.getAd(),hayvan.getYas(),hayvan.getTur());
        }
    }
}
