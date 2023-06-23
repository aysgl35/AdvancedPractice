package practice06.s02_oop_project;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        HayvanatBahcesi hb=new HayvanatBahcesi();
        HayvanatBahcesi hba=new HayvanatBahcesi();
        Aslan simba=new Aslan("Simba", 8,"Aslan");
        //System.out.println(simba.getAd());
        Aslan mamba=new Aslan("Mamba", 5,"Aslan");

        //System.out.println(mamba.getAd());
        //System.out.println(simba.getAd());
        //hb.hayvanEkle(simba);
        //hb.hayvanEkle(mamba);
        //hb.hayvanListele();
       // hb.hayvanTablola();
        hba.hayvanTablola();



    }
}
