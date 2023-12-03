/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Nasabah extends User{
    
    private Tabungan tabungan;
    
    public Nasabah(){};
    
    public Nasabah(String nama){
        super(nama);
    }
    
    public Nasabah(String nama, int pin){
        super(nama, pin);
    }
    
    public Tabungan getTabungan(){
        return this.tabungan;
    }
    
    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }
    
}
