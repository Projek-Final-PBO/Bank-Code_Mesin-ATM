/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author ACER N
 */
public abstract class Transaksi {
    private Akun akun;
    private int saldo;
    private String norek;
    
    public Transaksi(String norek){
        this.norek = norek;
    }
    
    public int GetSaldo(){
        return this.saldo;
    }
    
    public void SetSaldo(int saldo){
        this.saldo = saldo;
    }
    
    public String GetNorek(){
        return this.norek;
    }
    
    public abstract int GetTotalTransaksi(int jumlah);
    public abstract void setHasil(String noRek, int jumlah);
}
