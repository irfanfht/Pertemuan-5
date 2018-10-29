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
public class PBO210117060Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pain pain = new Pain();
        pain.setNama("Pain");
        pain.setPartner("konan");
        pain.setAsaldesa("Amegakure");  
        System.out.println("Nama : "+pain.getNama());
        System.out.println("Asal Desa : "+pain.getAsaldesa());
        System.out.println("Nama Partner : "+pain.getPartner()); 
        pain.jurus(); 
        
        
        Itachi itachi = new Itachi();
        itachi.setNama("Itachi Uchiha");
        itachi.setPartner("Kisame");
        itachi.setAsaldesa("Konoha");  
        System.out.println("Nama : "+itachi.getNama());
        System.out.println("Asal Desa : "+itachi.getAsaldesa());
        System.out.println("Nama Partner : "+itachi.getPartner()); 
        itachi.jurus();  
        
        Tobi tobi = new Tobi();
        tobi.setNama("Obito Uchiha");
        tobi.setPartner("Deidara");
        tobi.setAsaldesa("Konoha");  
        System.out.println("Nama : "+ tobi.getNama());
        System.out.println("Asal Desa : "+ tobi.getAsaldesa());
        System.out.println("Nama Partner : "+ tobi.getPartner()); 
        tobi.jurus();  
    }
    
}
