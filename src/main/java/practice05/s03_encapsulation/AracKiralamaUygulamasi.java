package practice05.s03_encapsulation;

public class AracKiralamaUygulamasi {
    public static void main(String[] args) {
        Arac arac= new Arac();
        arac.setMarka("Mercedes");
        arac.setModel("CLK-GTR");
        System.out.printf("Arac adi :", arac.getMarka());

    }

}
