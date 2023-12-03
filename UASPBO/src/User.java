/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class User {
    private String nama;
    private int pin;
    private String password;
    private Nasabah nasabah;
    
    public User(){};
    
    public User(String nama){
        this.nama = nama;
    }
    
    public User(String nama, int pin){
        this.nama = nama;
        this.pin = pin;
    }
    
    public String getNama(){
        return nama;
    }
    
    public int getPin(){
        return pin;
    }
    
    public Nasabah infoNasabah(){
        return this.nasabah;
    }
    
    public void infoNasabah(Nasabah nasabah){
    }
    
    public boolean adminTransfer(Nasabah nas1, Nasabah nas2, double nominal){
        return false;
    }
    
    public boolean adminTarikTunai(Nasabah nas, int pin, double nominal){
        return false;
    }
}
