/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Admin extends User{
    
    private Nasabah nasabah;
    double nominal;
    
    public Admin(){
        super();
    }
    
    public void infoNasabah(Nasabah nas){
        if(nas instanceof Nasabah){
            System.out.println("Nama : " + nas.getNama());
            System.out.println("Saldo : " + nas.getTabungan().getSaldo());
        }
    }
    
    public boolean adminTransfer(Nasabah nas_sumber, Nasabah nas_tujuan, double nominal){
        if(nas_sumber.getTabungan().getSaldo()>=nominal){
            nas_sumber.getTabungan().transfer(nas_tujuan, nominal);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean adminTarikTunai(Nasabah nas, int pin, double nominal){
        if(pin == nas.getPin()){
            nas.getTabungan().tarikTunai(nominal);
            return true;
        }else{
            return false;
        }
    }
}
