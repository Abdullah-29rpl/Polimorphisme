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
public class Smartphone extends Toko {
    int jmlkamera;
    
    public void setHarga(float harga){
        super.harga = harga;
    }
    
    public float getHarga(){
        System.out.println("Harga :" + harga);
    return harga ;
    }
    
    public void setTotal(int totalUnit){
        super.totalunit = totalUnit;
    }
    
    public int getTotal(){
        System.out.println("Total Unit :" + totalunit);
    return totalunit ;
    }
    
    public void setMerk(String merk){
        super.merk = merk;
    }
    
    public String getMerk(){
        System.out.println("Merk :" + merk);
    return merk ;
    }
    
    public void setJmlKamera(int jmlkamera){
        this.jmlkamera = jmlkamera;
    }
    
    public int getJmlKamera(){
        System.out.println("Jumlah Kamera :" + jmlkamera);
    return jmlkamera ;
    }
    
}
