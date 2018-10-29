/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : Program ini menampilkan SIAPA KAMU dengan teori polymorpisme
 */
package pbo2.pkg10117060.latihan52.siapakamu;

public class Dosen extends Manusia {
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void mengajarApa() {
        System.out.println("saya " + nama + " umur " + umur + " tahun sedang mengajar matakuliah " + mataKuliah);
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya dosen");
    }
}
