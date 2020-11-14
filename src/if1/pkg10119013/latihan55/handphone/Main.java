/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan55.handphone;

/**
 *
 * @author Fiona Avila
 */


public class Main {

    public static void main(String[] args) {
        Android oo1 = new Android("Samsung","Android","Grand",3000000);
        oo1.displayProduct();
        oo1.setKeyStore("234ibfd3840fo");
        System.out.println("Android Key Store : " + oo1.getKeyStore());
        System.out.println();
        
        Blackberry oo2 = new Blackberry("BlackB","RIM","Curve",2000000);
        oo2.displayProduct();
        oo2.setPinBB("BHS249");
        System.out.println("PIN : " + oo2.getPinBB());
        System.out.println();
        
        WindowsPhone oo3 = new WindowsPhone("Nokia","Win8","Lumia",1000000);
        oo3.displayProduct();
        oo3.setWpKeyStore("UUUQIJWORJ");
        System.out.println("Wp Key Store : " + oo3.getWpKeyStore());
        
        System.out.println();
        System.out.println("by. Fiona Avila");
    }
    
}
