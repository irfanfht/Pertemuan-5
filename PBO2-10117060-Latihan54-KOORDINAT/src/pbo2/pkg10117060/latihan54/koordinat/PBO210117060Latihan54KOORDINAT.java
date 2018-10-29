/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : Program ini berisi menampilkan warna dan dan sumbu kordinat
 */
package pbo2.pkg10117060.latihan54.koordinat;

/**
 *
 * @author Kamvang
 */
public class PBO210117060Latihan54KOORDINAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        WarnaKoordinat nWarnaKoordinat = new WarnaKoordinat("Jingga", 10, 4);
        System.out.println("Warna Koordinat : " + nWarnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + nWarnaKoordinat.getX() +", y : " + nWarnaKoordinat.getY());
    }
    
}
