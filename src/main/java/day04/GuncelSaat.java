package day04;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GuncelSaat {
    public static void main(String[] args) throws InterruptedException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        while (true){
            LocalTime simdikiZaman = LocalTime.now();
            System.out.format("\r" + dtf.format(simdikiZaman));
           // System.out.print("\r"+simdikiZaman);
            Thread.sleep(1000);
            /*
            Java programlama dilinde "\r" karakter dizisi, bir metin içindeki yer tutma karakteridir.
            Bu karakter, bir metin satırını başa sarar ve aynı satır üzerine yazmayı sağlar.
             "\r" karakteri, bir metin akışında kullanıldığında, imleci o satırın başına getirir
            ve ardından gelen karakterlerin üzerine yazılmasını sağlar. Bu genellikle bir metin düzenlemesi veya animasyon oluşturulması gibi durumlarda kullanılır.
             */
            /*
            Java'da "\r" ifadesi "carriage return" olarak bilinir. Carriage return,
            bir metin akışında imleci satır başına taşıyan bir kontrol karakteridir.
             */
        }
    }
}
