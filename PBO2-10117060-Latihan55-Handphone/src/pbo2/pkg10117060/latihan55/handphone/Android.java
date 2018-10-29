/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : Program ini menampilkan prodak handphone
 */
package pbo2.pkg10117060.latihan55.handphone;

public class Android extends Handphone{
    private String keyStone;

    public Android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    public String getKeyStone() {
        return keyStone;
    }

    public void setKeyStone(String keyStone) {
        this.keyStone = keyStone;
    }
}
