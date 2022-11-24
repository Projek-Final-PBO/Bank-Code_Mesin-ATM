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
 * Class ini merupakan turunan dari class Transaksi
 * @author Kelompok 3 (Bank Code)
 */
public class TarikUang extends Transaksi {
    
    /**
     * Method constructor dengan parameter
     * @param norek 
     */
    public TarikUang(String norek){
        super(norek);
    }
    
    /**
     * Method getter untuk mendapatkan nilai total transaksi berdasarkan jumlah tarik
     * @param jumlahtarik
     * @return hasil
     */
    @Override
    public int GetTotalTransaksi(int jumlahtarik){
        Akun akun = new Akun();
        akun.isiDataAkun(super.GetNorek());
        
        //Meng-convert ke dalam bentuk Integer
        super.SetSaldo(Integer.parseInt(akun.getSaldo()));
        
        int hasil = super.GetSaldo()-jumlahtarik;
        
        return hasil;
    }
    
    
}
