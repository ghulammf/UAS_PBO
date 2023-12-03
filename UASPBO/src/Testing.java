/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Testing {
    public static void main(String args[]){
        boolean status_tarik, status_transfer, status_admin_transfer, status_admin_tarik;
        
        Nasabah nas1 = new Nasabah("Agus", 123);
        Nasabah nas2 = new Nasabah("Budi", 456);
        User admin = new Admin();
        
        nas1.setTabungan(new Tabungan(1000000));
        nas2.setTabungan(new Tabungan(2000000));
        
        System.out.println("Cek saldo, " + nas1.getNama());
        System.out.println("Saldo Anda " + nas1.getTabungan().getSaldo());
        System.out.println();
        System.out.println("Tarik tunai senilai 80000");
        status_tarik = nas1.getTabungan().tarikTunai(80000);
        if(status_tarik){
            System.out.println("\tPenarikan berhasil");
        }else{
            System.out.println("\tPenarikan gagal");
        }
        System.out.println("Saldo Anda " + nas1.getTabungan().getSaldo());
        System.out.println();
        System.out.println("Tambah saldo senilai 50000");
        nas1.getTabungan().tambahSaldo(50000);
        System.out.println("Saldo Anda " + nas1.getTabungan().getSaldo());
        
        System.out.println("=============================");
        
        System.out.println("Cek saldo, " + nas2.getNama());
        System.out.println("Saldo Anda " + nas2.getTabungan().getSaldo());
        System.out.println();
        System.out.println("Tarik tunai senilai 150000");
        status_tarik = nas2.getTabungan().tarikTunai(150000);
        if(status_tarik){
            System.out.println("\tPenarikan berhasil");
        }else{
            System.out.println("\tPenarikan gagal");
        }
        System.out.println("Saldo Anda " + nas2.getTabungan().getSaldo());
        System.out.println();
        System.out.println("Tambah saldo senilai 70000");
        nas2.getTabungan().tambahSaldo(70000);
        System.out.println("Saldo Anda " + nas2.getTabungan().getSaldo());
        System.out.println();
        System.out.println("Transfer senilai 200000");
        status_transfer = nas2.getTabungan().transfer(nas1, 200000);
        if(status_transfer){
            System.out.println("\tTransfer berhasil");
        }else{
            System.out.println("Transfer gagal");
        }
        System.out.println();
        System.out.println("Saldo Anda " + nas2.getTabungan().getSaldo());
        System.out.println("=============================");
        System.out.println("Cek saldo, " + nas1.getNama());
        System.out.println("Saldo Anda " + nas1.getTabungan().getSaldo());
        
        System.out.println("\n<<========== PROGRAM ADMIN ===========>>\n");
        admin.infoNasabah(nas1);
        admin.infoNasabah(nas2);
        System.out.println("Admin melakukan transfer di akun Agus");
        status_admin_transfer = admin.adminTransfer(nas1, nas2, 30000);
        if(status_admin_transfer){
            System.out.println("\tTransfer admin berhasil");
        }else{
            System.out.println("Transfer admin gagal");
        }
        admin.infoNasabah(nas1);
        admin.infoNasabah(nas2);
        System.out.println("Admin tarik tunai 30000 di akun Budi");
        status_admin_tarik = admin.adminTarikTunai(nas2, 456, 30000);
        if(status_admin_tarik){
            System.out.println("\tTarik admin berhasil");
        }else{
            System.out.println("Tarik admin gagal");
        }
        admin.infoNasabah(nas2);
    }
}
