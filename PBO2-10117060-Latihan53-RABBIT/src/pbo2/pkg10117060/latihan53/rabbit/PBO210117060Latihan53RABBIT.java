/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : Program ini berisi menampilkan profile hewan peliharaan
 */
package pbo2.pkg10117060.latihan53.rabbit;

public class PBO210117060Latihan53RABBIT {

    public static void main(String[] args) {
        Animal nAnimal = new Animal(true, "gress", 4);
        Rabbit nRabbit = new Rabbit("Peter ", nAnimal.isVegetarian(), nAnimal.getEats(), nAnimal.getNoOfLegs(), "grey");
        System.out.println("Hello, His name is " + nRabbit.getName());
        System.out.println(nRabbit.getName() + "is Vegetarian? "+ nRabbit.isVegetarian());
        System.out.println(nRabbit.getName() + "eats " + nRabbit.getEats());
        System.out.println(nRabbit.getName() + "has "+  nRabbit.getNoOfLegs() + " legs");
        System.out.println(nRabbit.getName() + "color is " + nRabbit.getColor());
    }
    
}
