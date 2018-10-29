/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : Program inI menampilkan nama dan umur suatu barang
 */
package pbo2.pkg10117060.latihan56.umurbarangantik;

public class PBO210117060Latihan56UmurBarangAntik {
    
    public static void main(String[] args) {
        // TODO code application logic here
        BarangAntik nBarangAntik = new BarangAntik(234);
        Radio nRadio = new Radio(nBarangAntik.umur);
        nRadio.setName("Radio AM");
        
        System.out.println("Nama barang antik : " + nRadio.getName());
        nBarangAntik.tammpilUmur();
    }
    
}
