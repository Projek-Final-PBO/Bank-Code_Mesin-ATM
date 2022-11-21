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
public class TarikUang extends Transaksi {
    
    
    public TarikUang(String norek){
        super(norek);
    }
    
    public int GetTotalTransaksi(int jumlahtarik){
        Akun akun = new Akun();
        akun.isiDataAkun(super.GetNorek());
        
        super.SetSaldo(Integer.parseInt(akun.getSaldo()));
        
        int hasil = super.GetSaldo()-jumlahtarik;
        
        return hasil;
    }
    
    public void setHasil(String norek, int hasil){
        String path = "DatabaseBank.txt";
        String temp = "TempDatabase.txt";
        try {
        // Membuka file database 
        File fileAwal = new File(path);
        File fileTemp = new File(temp);

        
        FileReader fileReader = new FileReader(fileAwal);
        FileWriter fw = new FileWriter(temp, true);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bw = new BufferedWriter(fw);
        
        PrintWriter pw = new PrintWriter(bw);
        
        String noRek;
        String pin;
        String saldo;
        String username;
        String noHP;
        String email;
       
        String saldoBaru = String.valueOf(hasil);

        // Read data
        Scanner scan = new Scanner(new File(path));
        scan.useDelimiter("[,\\n]");
        
        while(scan.hasNext())
        {
            noRek = scan.next();
            pin = scan.next();
            saldo = scan.next();
            username = scan.next();
            noHP = scan.next();
            email = scan.next();
            if(noRek.equals(norek)){
                pw.println(noRek+","+pin+","+saldoBaru+","+username+","+noHP+","+email);
            }else{
                pw.println(noRek+","+pin+","+saldo+","+username+","+noHP+","+email);
            }
        }

        // wajib ditutup
        scan.close();
        pw.flush();
        bw.flush();
        
        bufferedReader.close();
        bw.close();
        
        fileAwal.delete();
        fileTemp.renameTo(fileAwal);
        }
        catch (Exception e){
            
        }
    }
}
