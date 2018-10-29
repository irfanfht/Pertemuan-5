/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117060.latihan59.detektifkonan;

public class TokohUtama extends Tokoh {
    private String tujuan;
    private String tim;
    
    public TokohUtama(String nama, String peran, String tujuan, String tim) {
        super(nama,peran);
        this.tujuan = tujuan;
        this.tim = tim;
    }
    
    public String getTujuan() {
        return tujuan;
    }
    
    public String getTim() {
        return tim;
    }
    
    public void tampil() {
        System.out.println("Nama : " + getNama());
        System.out.println("Peran : " + peran());
        System.out.println("Tim : " + getTim());
        System.out.println("Tujuan : " + getTujuan());
        System.out.println("");
    }
}
