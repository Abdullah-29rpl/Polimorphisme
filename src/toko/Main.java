/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko;

/**
 *
 * @author apple
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //objek dari class
        Toko objek1 = new Toko();
        Smartphone objek2 = new Smartphone();
        TV objek3 = new TV();
        KipasAngin objek4 = new KipasAngin();
        
        
        objek1.setAdmin("Abdul");
        objek1.getAdmin();
        
        System.out.println("");
        System.out.println(" Smartphone ");
        System.out.println("============");
        objek1.display();
        objek2.setMerk("Samsung");
        objek2.setJmlKamera(3);
        objek2.setHarga(2000000);
        objek2.setTotal(200);
        objek2.getMerk();
        objek2.getJmlKamera();
        objek2.getHarga();
        objek2.getTotal();
        
        System.out.println("");
        System.out.println(" Televisi ");
        System.out.println("==========");
        objek1.display();
        objek3.setMerk("Samsung");
        objek3.setJenis("LED");
        objek3.setHarga(2999000);
        objek3.setTotal(100);
        objek3.getMerk();
        objek3.getJenis();
        objek3.getHarga();
        objek3.getTotal();
        
        System.out.println("");
        System.out.println(" Kipas Angin ");
        System.out.println("=============");
        objek1.display();
        objek4.setMerk("Samsung");
        objek4.setUkuran("15 cm");
        objek4.setHarga(350000);
        objek4.setTotal(500);
        objek4.getMerk();
        objek4.getUkuran();
        objek4.getHarga();
        objek4.getTotal();
        
    }
    
}
