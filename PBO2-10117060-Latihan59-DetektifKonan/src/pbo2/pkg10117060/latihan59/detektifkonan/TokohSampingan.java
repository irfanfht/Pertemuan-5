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
public class TokohSampingan extends Tokoh {
    private String relasi;
    
    public TokohSampingan(String nama, String peran, String relasi) {
        super(nama,peran);
        this.relasi = relasi;
    }
    
    public String getRelasi() {
        return relasi;
    }
    
    public void tampil() {
        System.out.println("Nama : " + getNama());
        System.out.println("Peran : " + peran());
        System.out.println("Relasi dengan Tokoh utama : " + getRelasi());
        System.out.println("");
    }
    
}
