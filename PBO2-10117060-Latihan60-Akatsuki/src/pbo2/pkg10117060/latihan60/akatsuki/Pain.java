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
public class Pain extends Akatsuki {
    private String kekuatanpain; 

   
    

    @Override
    public void jurus() {
    
        System.out.println("Pain memiliki jurus : ");   
        System.out.println("rinenggan");   
        System.out.println("shibakutensei");   
        System.out.println("shinratensei");   
        System.out.println(""); 
    }

    public String getKekuatanpain() {
        return kekuatanpain;
    }

    public void setKekuatanpain(String kekuatanpain) {
        this.kekuatanpain = kekuatanpain;
    }

    
}
