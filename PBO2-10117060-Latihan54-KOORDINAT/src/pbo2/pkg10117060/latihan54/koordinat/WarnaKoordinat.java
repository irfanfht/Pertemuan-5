/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : Program ini berisi menampilkan warna dan dan sumbu kordinat
 */
package pbo2.pkg10117060.latihan54.koordinat;

public class WarnaKoordinat extends Koordinat{
   public String namaWarna;

    public WarnaKoordinat(String namaWarna, int x, int y) {
        super(x, y);
        this.namaWarna = namaWarna;
    }

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    } 
}
