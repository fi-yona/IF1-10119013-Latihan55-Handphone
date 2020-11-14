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


public class WindowsPhone extends Handphone{
    
    private String wpKeyStore;
    
    public WindowsPhone(String man, String os, String model, int harga){
        super(man,os,model,harga);
    }
    
    public String getWpKeyStore(){
        return wpKeyStore;
    }
    
    public void setWpKeyStore(String wpKeyStore){
        this.wpKeyStore = wpKeyStore;
    }
}
