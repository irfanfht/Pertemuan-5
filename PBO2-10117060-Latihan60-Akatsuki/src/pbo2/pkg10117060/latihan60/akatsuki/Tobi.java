/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117060.latihan60.akatsuki;

/**
 *
 * @author Kamvang
 */
public class Tobi extends Akatsuki {
    private String kekuatantobi;

    
    @Override
    public void jurus() {
       System.out.println("memiliki jurus : ");      
        System.out.println("Sharinggan");   
        System.out.println("Kamui");   
        System.out.println("Gokakyu no jutsu");   
        System.out.println("");
    }
    public String getKekuatantobi() {
        return kekuatantobi;
    }

    public void setKekuatantobi(String kekuatantobi) {
        this.kekuatantobi = kekuatantobi;
    }
}
