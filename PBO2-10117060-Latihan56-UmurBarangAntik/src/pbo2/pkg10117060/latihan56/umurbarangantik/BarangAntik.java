/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : Program inI menampilkan nama dan umur suatu barang
 */
package pbo2.pkg10117060.latihan56.umurbarangantik;

public class BarangAntik {
    int umur;

    public BarangAntik(int umur) {
        this.umur = umur;
    }
    
    public void tammpilUmur(){
        System.out.println("Umur barang antik ini adalah : " + umur + " tahun");
    }
}
