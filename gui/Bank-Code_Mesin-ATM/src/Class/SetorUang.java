/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SetorUang extends Transaksi {
    
    public SetorUang(String norek){
        super(norek);
    }
    
    public int GetTotalTransaksi(int jumlahsetor){
        Akun akun = new Akun();
        akun.isiDataAkun(super.GetNorek());
        
        super.SetSaldo(Integer.parseInt(akun.getSaldo()));
        
        int hasil = super.GetSaldo()+jumlahsetor;
        
        return hasil;
    }
}
