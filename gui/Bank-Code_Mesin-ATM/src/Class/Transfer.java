/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author ILHAM
 */
public class Transfer extends Transaksi{
    private String norektujuan;
        public Transfer(String norek, String norektujuan){
        super(norek);
        this.norektujuan = norektujuan;
    }
        
     public String getnorektujuan(){
         return this.norektujuan;
     }
    
    public int GetTotalTransaksi(int jumlah){
      return 0;
    }
    
    public void Transfer(int jumlah){
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
