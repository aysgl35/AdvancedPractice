package day03;

public class S02_PassByValue_IsimDuzenleme {
    public static void main(String[] args) {


          /*
        İçinde verilmiş bir sayının orijinal değerini değiştirmeden aşağıdaki işlemleri yapan metotlar yazın.
            int sayi = 42;
            - Sayıyı karesini alın.
            - Sayıyı küpünü alın.
            - Sayının karekökünü alın.
            - Sayının mutlak değerini alın.
            - Sayıyı 10 ile çarpın ve sonucu yazdırın.
    */

        int sayi=42;
        karesiniAl(sayi);
        kupunuAl(sayi);
        karekokunuAl(sayi);
        mutlakDegeriniAl(sayi);

    }

    public static void karesiniAl  (int deger) {
        //int karesi=deger*deger;
        deger= (int) Math.pow(deger,2);
        System.out.println(deger);
    }

    public static void kupunuAl(int deger) {
        deger= (int) Math.pow(deger,3);
        System.out.println(deger);
    }
    public static void karekokunuAl (int deger) {
        deger= (int) Math.sqrt(deger);

        System.out.println(deger);
    }
    public static void mutlakDegeriniAl(int deger) {
       /* if(deger<0){
            deger= deger*-1;
            System.out.println(deger);
        }else

        System.out.println(deger);*/
        deger=Math.abs(deger);
        System.out.println(deger);
    }
    public static void SayiyiOnlaCarp (int deger) {
        deger= deger*10;

        System.out.println(deger);
    }
}