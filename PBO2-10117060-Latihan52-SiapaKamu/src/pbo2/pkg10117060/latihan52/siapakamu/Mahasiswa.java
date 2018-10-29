/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : Program ini menampilkan SIAPA KAMU dengan teori polymorpisme
 */
package pbo2.pkg10117060.latihan52.siapakamu;

public class Mahasiswa extends Manusia{
     private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void kelasApa() {
        System.out.println("Saya " + nama + " umur " + umur + " tahun sedang belajar di kelas " + kelas);
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
}
