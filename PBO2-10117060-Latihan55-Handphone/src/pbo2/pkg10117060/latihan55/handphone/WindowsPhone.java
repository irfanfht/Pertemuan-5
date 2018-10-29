/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : Program ini menampilkan prodak handphone
 */
package pbo2.pkg10117060.latihan55.handphone;

public class WindowsPhone extends Handphone{
    private String wpKeyStone;

    public WindowsPhone(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }
    
    

    public String getWpKeyStone() {
        return wpKeyStone;
    }

    public void setWpKeyStone(String wpKeyStone) {
        this.wpKeyStone = wpKeyStone;
    }
}
