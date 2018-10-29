/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : Program ini menampilkan prodak handphone
 */
package pbo2.pkg10117060.latihan55.handphone;

/**
 *
 * @author Kamvang
 */
public class Handphone {
    protected String manufacture;
    protected String operationalSystem;
    protected String model;
    protected int harga;

    public Handphone(String man, String os, String model, int harga) {
        this.manufacture = man;
        this.operationalSystem = os;
        this.model = model;
        this.harga = harga;
    }

    public void displayProduct(){
        System.out.println("Manufaktur : " + manufacture);
        System.out.println("OS : " + operationalSystem);
        System.out.println("Model : " + model);
        System.out.println("Harga : " + harga);
    }
}
