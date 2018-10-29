/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : Program ini berisi menampilkan profile hewan peliharaan
 */
package pbo2.pkg10117060.latihan53.rabbit;


public class Rabbit extends Animal{
    private final String color;
    private final String name;

    public Rabbit(String name, boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
