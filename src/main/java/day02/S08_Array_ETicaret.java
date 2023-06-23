package day02;

public class S08_Array_ETicaret {
     /*
        Bir e-ticaret uygulamasında, bir kullanıcının sepetindeki ürünleri bir array'de tutuyorsunuz.
        Kullanıcının sepetinde belirli bir ürünün olup olmadığını kontrol edin.
        {"Telefon", "Bilgisayar", "Klavye", "Mouse"}
    */
     public static void main(String[] args) {
         String [] arr={"Telefon", "Bilgisayar", "kitaq", "Mouse"};
         String aranaUrun="Klavye";
         boolean urunVar=false;
         for(String w:arr) {
             if (w.equals(aranaUrun)) {
                 urunVar = true;
                 break;
             }
         }
         if (urunVar){
             System.out.println("Sepetinizde "+aranaUrun+" bulunmaktadir");
         } else System.out.println("Sepetinizde "+aranaUrun+" bulunmamaktadir");

     }
}
