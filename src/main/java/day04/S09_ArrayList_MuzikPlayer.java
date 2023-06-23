package day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S09_ArrayList_MuzikPlayer {
    /*
        Bir müzik çalma listesi uygulaması geliştiriyorsunuz.
        Kullanıcılar, çalma listelerine şarkı ekleyebilmeli, şarkıları sıralayabilmeli ve
        şarkıları listeden silebilmelidir.
        Ayrıca, kullanıcılara çalma listesini tamamen sıfırlama seçeneği de sunmanız isteniyor.
    */
    /*
    ODEV:::   1) muzik player ve ogrenci listesi odevlerinde reusable methodlar olusturulacak
    2)reusable class olusturulup bu methodlar bu classda toplanacak
    3) ve odevlerde bu reusable methodlar kullanilacak
    4)inherirtance kullanilacak (edited)
     */
    static Scanner input = new Scanner(System.in);
    static List<String> muzikListesi = new ArrayList<>();
    public static void main(String[] args) {
        int secim;
        System.out.println("Muzik dunyana hosgeldin :)");
        do {
            System.out.println( "     Listene sarki eklemek istersen  --> 1" +
                    "\n     Srkilarini siralamak istersen   --> 2" +
                    "\n     Listenden sarki silmek istersen --> 3" +
                    "\n     Listeni sifirlamak icin         --> 4"+
                    "\n     Listeni gormek istersen         --> 5" +
                    "\n     Cikmak istersen                 --> 0");


            secim = input.nextInt();
            input.nextLine();
            switch (secim){
                case 1:
                    System.out.println("Ekleyecegin sarki ismini gir lutfen:");
                    String sarki = input.nextLine();
                   listeyeEkle(muzikListesi,sarki);
                    break;
                case 2:
                    siralamak();
                    break;
                case 3:
                    silme();
                    break;
                case 4:
                    tumunuSil();
                    break;
                case 5:
                    liste();
                    break;
                case 0:
                    System.out.println("Cıkıs yapildi");
                    System.exit(0);
            }


        }while (secim!=0);



    }

    private static void liste() {
    }

    private static void tumunuSil() {
    }

    private static void silme() {
    }

    private static void siralamak() {
    }

    public static void listeyeEkle(List<String> liste, String str){
        if (!liste.contains(str)){
            liste.add(str);
            System.out.println("sarkiniz ekleni");
        } else if(liste.contains(str)){
            System.out.println("sarki listete var yine de ekleyelim mi");
            System.out.println("evet ya da hayir yazin");
            String cevap=input.nextLine();
          Object sec=cevap.contains("evet")? liste.add(str): cevap.contains("hayir")? "sarki eklenmedi":"Baska sarki girin";
            System.out.println(muzikListesi);
        //Not: ternary false kismi calismiyor
        }

    }
}