/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan gaji karyawan
 */
package pbo2.pkg10117060.latihan51.haji.karya;

/**
 *
 * @author Kamvang
 */
public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public float tunjanganKehadiran(int hadir) {
        tunjanganKehadiran = kehadiran * 10000;
        return tunjanganKehadiran;
    }

    public float tunjanganJabatan(String jabatan) {
        if (jabatan.equalsIgnoreCase("manager")) {
            tunjanganJabatan = 2000000;
        } else if (jabatan.equalsIgnoreCase("kabag")) {
            tunjanganJabatan = 1000000;
        } else {
            tunjanganJabatan = 0;
        }
        
        return tunjanganJabatan;
    }

    public float tunjanganGolongan(int golongan) {
        switch (golongan) {
            case 1:
                tunjanganGolongan = 500000;
                break;
            case 2:
                tunjanganGolongan = 1000000;
                break;
            case 3:
                tunjanganGolongan = 1500000;
                break;
            default:
                tunjanganGolongan = 0;
                break;
        }
        
        return tunjanganGolongan;
    }    
    
    public float gajiTotal(){
        return tunjanganGolongan + tunjanganJabatan + tunjanganKehadiran;
    }
}
