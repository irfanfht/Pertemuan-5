/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117060.latihan60.akatsuki;

/**
 *
 * @author Kamvang
 */
public class Itachi extends Akatsuki{
   private String kekuatanitachi;

    @Override
    public void jurus() {
       System.out.println("memiliki jurus : ");   
        System.out.println("Susano'o");   
        System.out.println("Sharinggan");   
        System.out.println("Izanami");   
        System.out.println("Gokakyu no jutsu");   
        System.out.println("");

    }

    public String getKekuatanitachi() {
        return kekuatanitachi;
    }

    public void setKekuatanitachi(String kekuatanitachi) {
        this.kekuatanitachi = kekuatanitachi;
    }
    
}
