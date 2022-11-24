/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 * Class ini merupakan turunan dari class Transaksi
 * @author Kelompok 3 (Bank Code)
 */
public class Transfer extends Transaksi{
    private String norektujuan;
    
    /**
     * Method constructor dengan parameter
     * @param norek
     * @param norektujuan 
     */
    public Transfer(String norek, String norektujuan){
        super(norek);
        this.norektujuan = norektujuan;
    }
     
    /**
     * Method getter untuk mendapatkan nilai norek tujuan
     * @return this.norektujuan
     */ 
    public String getnorektujuan(){
        return this.norektujuan;
    }
    
     /**
      * Method getter untuk mendapatkan nilai total transaksi
      * @param jumlah
      * @return 0
      */
    public int GetTotalTransaksi(int jumlah){
      return 0;
    }
    
    /**
     * Method untuk mengubah nilai total transaksi di akun pengirim dan akun penerima
     * @param jumlah 
     */
    public void Transfer(int jumlah){
        //Memanggil method constructor tanpa parameter
        Akun akun = new Akun();
        Akun akunpenerima = new Akun();
        TarikUang tu = new TarikUang(akun.getNomorRekening());
        SetorUang su = new SetorUang(akunpenerima.getNomorRekening());
        try {
        akun.setHasil(akun.getNomorRekening(),tu.GetTotalTransaksi(jumlah));
        akunpenerima.setHasil(akunpenerima.getNomorRekening(),su.GetTotalTransaksi(jumlah));
        }
        catch (Exception e){
            
        }
    }
    
}
