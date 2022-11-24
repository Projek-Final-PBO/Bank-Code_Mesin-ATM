package Class;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Class yang berhubungan dengan akun-akun pada file database
 * @author Kelompok 3 (Bank Code)
 */
public class Akun
{

    // Fields 
    private String pin;
    private String noRek;
    private String saldo;
    private String username;
    private String noHP;
    private String email;
    

    /**
     * Method constructor tanpa parameter
     */
    public Akun()
    {

    }
    
    /**
     * Method constructor dengan parameter
     * @param noRek
     * @param pin
     * @throws IOException 
     */
    public Akun(String noRek, String pin) throws IOException
    {
        this.noRek = noRek;
        // Mendapatkan pin dari database
        this.pin = pin;
    }
    
    /**
     * Method getter untuk mendapatkan nilai dari PIN
     * @return this.pin
     */
    public String getPin()
    {
        return this.pin;
    }
    
    /**
     * Method untuk mendapatkan nilai PIN pada database
     * sesuai dengan parameternya:
     * @param noRek
     * @return this.pin
     * @throws IOException 
     */
    public String getPin(String noRek) throws IOException
    {
        FileReader fileReader = new FileReader("DatabaseBank.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        // Membaca satu baris saja
        String data = bufferedReader.readLine();
        // Mengambil data dengan fungsi delimiter koma(,)
        StringTokenizer stringTokenizer = new StringTokenizer(data,",");
        // Membaca sampai akhir dari file database
        while (data != null){
            stringTokenizer = new StringTokenizer(data, ",");
            // Menemukan pin berdasarkan id yang ditentukan
            if(noRek.equals(stringTokenizer.nextToken())){
                // Mendapatkan pin
                this.pin = stringTokenizer.nextToken();
                break;
            }else{
                // Membaca baris setelahnya karena bisa jadi yang sebelumnya tidak ditemukan
                data = bufferedReader.readLine();
            }
        }
        // wajib ditutup
        bufferedReader.close();
        fileReader.close();

        return this.pin;
    }
    
    /**
     * Method untuk mengatur/mengubah PIN di database dengan parameter
     * dan juga mereplace file lama dengan file baru
     * @param pinBaru
     * @throws IOException 
     */
    public void setPin(String pinBaru) throws IOException
    {
        // Membuka file database 
        File file = new File("DatabaseBank.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Membuat file DatabaseTemp
        File temp = new File("TempDatabaseDokter.txt");
        FileWriter fileWriter = new FileWriter(temp);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        // Read data
        String data = bufferedReader.readLine();
        // Membaca file dan memisahkanya dengan fungsi delimiter yang ditandai dengan koma
        StringTokenizer stringTokenizer = new StringTokenizer(data, ",");
        // Membaca keseluruhan file
        while(data != null)
        {
            stringTokenizer = new StringTokenizer(data, ",");
            // Move to id
            if(noRek.equals(stringTokenizer.nextToken())){
                // Go to old pin
                stringTokenizer.nextToken();
                // receive saldo
                String saldot = stringTokenizer.nextToken();
                // receive username
                String usernamet = stringTokenizer.nextToken();
                // receive noHP
                String noHPt = stringTokenizer.nextToken();
                // receive email
                String emailt = stringTokenizer.nextToken();
                // copy ke databaseTemp
                bufferedWriter.write(noRek + "," + pinBaru + "," + saldot + "," + usernamet + "," + noHPt+ "," + emailt);
            }else{
                // Copy ke databaseTemp
                bufferedWriter.write(data);
                bufferedWriter.newLine();
            }
            data = bufferedReader.readLine();
        }
        // Menulis data ke file database
        bufferedWriter.flush();

        // wajib tutup!!!
        bufferedReader.close();
        bufferedWriter.close();
        fileReader.close();
        fileWriter.close();

        // Delete database yang lama
        file.delete();
        // Karena database yang lama itu sudah di delete maka kita harus merenamenya seperti yang sebelum di delete tadi untuk database temp ini
        temp.renameTo(file);
    }
    
    /**
     * Method untuk mengecek isi file DatabaseBank dengan parameter
     * @param norek 
     */
    public void isiDataAkun(String norek){
        String path = "DatabaseBank.txt";
        try {
        // Membuka file database 
        File file = new File(path);
        
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        

        // Read data
        Scanner scan = new Scanner(new File(path));
        scan.useDelimiter("[,\\n]");
        
        //Membaca seluruh data
        while(scan.hasNext())
        {
            this.noRek = scan.next();
            if(this.noRek.equals(norek)){
                this.pin = scan.next();
                this.saldo = scan.next();
                this.username = scan.next();
                this.noHP = scan.next();
                this.email = scan.next();
            }else{
                continue;
            }
        }

        // wajib ditutup
        bufferedReader.close();
        scan.close();
        fileReader.close();
        }
        catch (Exception e){
            
        }
    }
    
    /**
     * Method untuk mengubah saldo nasabah jika noRek sesuai 
     * @param norek
     * @param hasil
     * @throws IOException 
     */
    public void setHasil(String norek, int hasil) throws IOException{
        String path = "DatabaseBank.txt";
        String temp = "TempDatabase.txt";
        //try {
        // Membuka file database 
        File fileAwal = new File(path);
        File fileTemp = new File(temp);

        FileWriter fw = new FileWriter(temp, true);
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
        scan.useDelimiter("[,\n]");
        
        //Membaca seluruh data
        while(scan.hasNext())
        {
            noRek = scan.next();
            pin = scan.next();
            saldo = scan.next();
            username = scan.next();
            noHP = scan.next();
            email = scan.next();
            //Kondisi jika norek == noRek
            if(noRek.equals(norek)){
                bw.write(noRek + "," + pin + "," + saldoBaru + "," + username + "," + noHP+ "," + email);
                //bw.newLine();
            }else{
                bw.write(noRek + "," + pin + "," + saldo + "," + username + "," + noHP+ "," + email);
                //bw.newLine();
            }
        }

        // wajib ditutup
        scan.close();
        pw.flush();
        pw.close();
        bw.flush();
        bw.close();
        fw.close();
        fileAwal.delete();
        
       //Path fileAsli = Paths.get(path);
       //Path fileBaru = Paths.get(temp);
        
        
        //Files.move(fileBaru, fileBaru.resolveSibling(path));
        //fileTemp.delete();
        
        //File dump = new File(path);
        fileTemp.renameTo(fileAwal);
        
        //if(fileTemp.renameTo(fileAwal))
        //{
        //    fileAwal.delet();
                    
        //}
        //}
        //catch (Exception e){
            
        //}
    }
    
    /**
     * Method untuk menghapus file lama dan 
     * menggantinya dengan file yang baru
     */
    public void update(){
        String path = "DatabaseBank.txt";
        String temp = "TempDatabase.txt";
        Path fileAsli = Paths.get(path);
        //String temp2 = "Temp2Database.txt";

        File fileAwal = new File(path);
        File fileTemp = new File(temp);
        //File fileTemp2 = new File(temp2);

        fileAwal.delete();
        //Files.delete(fileAsli);
        fileTemp.renameTo(fileAwal);
    }
    
    /**
     * Method untuk memasukkan data akun bank yang baru
     * @param dataUser
     * @throws IOException 
     */
    public void akunBaru(ArrayList<String> dataUser)throws IOException{
        //Membuat noRekening yang random
        int random = (int) (Math.random() * (1000000 - 100000)) + 100000;
        //Convert dia ke string karena data bilangan ini akan di simpan di file database beresktensi .txt
        String noRekening= Integer.toString(random);
        
        this.noRek = noRekening;
        //Membuka file database
        FileWriter filewr = new FileWriter("DatabaseBank.txt", true);
        BufferedWriter bufferedWr = new BufferedWriter(filewr);
        
        //Menuliskan ke file database dengan format dibawah
        bufferedWr.write(noRekening+ "," + dataUser.get(0) + "," + dataUser.get(1) + "," + dataUser.get(2) + "," + dataUser.get(3)+ "," + dataUser.get(4));
        bufferedWr.newLine();
        bufferedWr.flush();
        //harus ditutup
        bufferedWr.close();
        filewr.close();
    }
    
    /**
     * Method untuk mengecek noRek dari database
     * @param noReken
     * @param pinen
     * @return adaData
     * @throws IOException 
     */
    public boolean checkNoRek(String noReken,String pinen) throws IOException{
        
        boolean adaData = true;
        String path = "DatabaseBank.txt";
        try {
        // Membuka file database 
        File file = new File(path);
        
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
               
        // Read data
        Scanner scan = new Scanner(new File(path));
        scan.useDelimiter("[,\\n]");
        
        String noReke, pine,saldoe, usernamee,noHPe,emaile;
        
        //Membaca seluru data/file database
        while(scan.hasNext())
        {
            noReke = scan.next();
            pine = scan.next();
            saldoe = scan.next();
            usernamee = scan.next();
            noHPe = scan.next();
            emaile = scan.next();
            //Kondisi jika noReken == noReke dan pine == pinen
            if(noReke.equals(noReken) && pine.equals(pinen)){
                adaData = true;
                break;
            }else{
                adaData = false;
            }
        }

        // wajib ditutup
        bufferedReader.close();
        scan.close();
        fileReader.close();
        }
        catch (Exception e){
            
        }
        return adaData;
    }
    
    /**
     * Method untuk mengecek pin dari database
     * @return adaData
     * @throws IOException 
     */
    public boolean checkPin() throws IOException{
        
        boolean adaData = true;
        //Membuka file database
        FileReader fileR = new FileReader("DatabaseBank.txt");
        BufferedReader bufferedR = new BufferedReader(fileR);
        String data = bufferedR.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(data,",");
        
        //Membaca seluruh data
        while(data != null){
           stringTokenizer = new StringTokenizer(data.substring(6),",");
           //Kondisi jika pin ditemukan di file database
           if(pin.equals(stringTokenizer.nextToken())){
               adaData = true;
               break;
           }else{
               adaData = false;
           }
           data = bufferedR.readLine();
       }
        bufferedR.close();
        fileR.close();
        return adaData;
    }

    /**
     * Method getter untuk mendapatkan nilai saldo
     * @return this.saldo
     */
    public String getSaldo(){
        return this.saldo;
    }
    
    /**
     * Method getter untuk mendapatkan nilai username
     * @return this.username
     */
    public String getUserName(){
        return this.username;
    }
    
    /**
     * Method getter untuk mendapatkan nilai No.Hp
     * @return this.noHP
     */
    public String getNoHp(){
        return this.noHP;
    }
    
    /**
     * Method getter untuk mendapatkan nilai email
     * @return this.email
     */
    public String getEmail(){
        return this.email;
    }
    
    /**
     * Method getter untuk mendapatkan nilai Nomor Rekening
     * @return this.noRek
     */
    public String getNomorRekening(){
        return this.noRek;
    }
}