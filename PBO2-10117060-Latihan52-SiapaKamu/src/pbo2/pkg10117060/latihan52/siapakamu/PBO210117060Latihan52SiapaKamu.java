/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117060.latihan52.siapakamu;


public class PBO210117060Latihan52SiapaKamu {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen ndosen = new Dosen();

        ndosen.setNama("Rizki Adam Kurniawan");
        ndosen.setUmur(27);
        ndosen.setNip("41227829930");
        ndosen.setMataKuliah("PBO");

        System.out.println("NIP DOSEN : " + ndosen.getNip());
        ndosen.siapaKamu();
        ndosen.mengajarApa();
        System.out.println("");

        Mahasiswa nmahasiswa = new Mahasiswa();
        nmahasiswa.setNama("Nindi");
        nmahasiswa.setUmur(17);
        nmahasiswa.setNim("10110269");
        nmahasiswa.setKelas("PBO2");
        
        System.out.println("NIM MAHASISWA : "+nmahasiswa.getNim());
        nmahasiswa.siapaKamu();
        nmahasiswa.kelasApa();
    }
    
}
