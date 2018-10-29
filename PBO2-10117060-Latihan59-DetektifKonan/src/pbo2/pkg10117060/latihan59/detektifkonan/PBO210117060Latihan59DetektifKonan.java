/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117060.latihan59.detektifkonan;

/**
 *
 * @author Kamvang
 */
public class PBO210117060Latihan59DetektifKonan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TokohUtama conan = new TokohUtama("Conan Edogawa", "Detektif handal", "bermain dengan kasus", "Detektif");
        conan.tampil();
        
        TokohUtama ran = new TokohUtama("Ran Mouri", "Jago Karate", "Terkenal Ahli Karate di Seluruh Jepang", "SMA");
        ran.tampil();
        
        TokohUtama kogoro = new TokohUtama("Kogoro Mouri", "Detektif Swasta", "Pelopor memecahkan kasus", "Detektif Swasta");
        kogoro.tampil();
        
        TokohSampingan heiji = new TokohSampingan("Heiji Hattori", "SMA", "Detektif");
        heiji.tampil();
        
        TokohSampingan kazuha = new TokohSampingan("Kazuha Tayoma", "Jago Aikido", "Temannya Ran");
        kazuha.tampil();
       
        
        
    }
    
}
