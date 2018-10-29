/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : Program inI menampilkan nama dan umur suatu barang
 */
package pbo2.pkg10117060.latihan56.umurbarangantik;

public class Radio extends BarangAntik{
   private String name;

    public Radio(int umur) {
        super(umur);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 
}
