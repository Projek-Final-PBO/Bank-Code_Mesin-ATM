/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 * Sebuah Class abstract yang tidak dapat untuk dibuat objek 
 * untuk mengaksesnya harus diturunkan dari class lain
 * @author Kelompok 3 (Bank Code)
 */
public abstract class Transaksi {
    private Akun akun;
    private int saldo;
    private String norek;
    
    /**
     * Method constructor dengan parameter
     * @param norek 
     */
    public Transaksi(String norek){
        this.norek = norek;
    }
    
    /**
     * Method getter untuk mendapatkan nilai saldo
     * @return this.saldo
     */
    public int GetSaldo(){
        return this.saldo;
    }
    
    /**
     * Method setter untuk mengatur/mengubah nilai saldo
     * @param saldo 
     */
    public void SetSaldo(int saldo){
        this.saldo = saldo;
    }
    
    /**
     * Method getter untuk mendapatkan nilai norek
     * @return this.norek
     */
    public String GetNorek(){
        return this.norek;
    }
    
    /**
     * Method abstract yang harus di override di subclassnya 
     * dan bertujuan mendapatkan nilai total transaksi
     * @param jumlah
     * @return 
     */
    public abstract int GetTotalTransaksi(int jumlah);
    //public abstract void setHasil(String noRek, int jumlah);
}
