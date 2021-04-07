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
public class Toko {
    private String admin;
    float harga;
    int totalunit;
    String merk;
    
    public void display(){
    System.out.println("Data barang yang dientry :");
    }
    
    public void setAdmin(String admin){
    this.admin = admin;
    }
    
    public String getAdmin(){
        System.out.println("Nama Admin : "+ admin);
        return admin;
    }

    
    
}
