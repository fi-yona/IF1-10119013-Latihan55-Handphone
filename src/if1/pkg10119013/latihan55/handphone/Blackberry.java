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

public class Blackberry extends Handphone{
    
    private String pinBB;
    
    public Blackberry(String man, String os, String model, int harga){
        super(man,os,model,harga);
    }
    
    public String getPinBB(){
        return pinBB;
    }
    
    public void setPinBB(String pinBB){
        this.pinBB = pinBB;
    }
}
