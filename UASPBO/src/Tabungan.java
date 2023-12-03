/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Tabungan {
    
    protected double saldo;
    
    public Tabungan(double saldo){
        this.saldo = saldo;
    }
     
    public void tambahSaldo(double nominal){
        saldo = saldo + nominal;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public boolean tarikTunai(double nominal){
        if(saldo >= nominal){
            saldo -= nominal;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean transfer(Nasabah nas, double nominal) {
        if (saldo >= nominal) {
            nas.getTabungan().tambahSaldo(nominal);
            saldo = saldo - nominal;
            return true;
        } else {
            return false;
        }
    }
}
