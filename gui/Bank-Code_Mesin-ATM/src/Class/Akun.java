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

public class Akun
{

    // Fields 
    private String pin;
    private String noRek;
    private String saldo;
    private String username;
    private String noHP;
    private String email;
    


    public Akun()
    {

    }
    
    public Akun(String noRek, String pin) throws IOException
    {
        this.noRek = noRek;
        // Mendapatkan pin dari database
        this.pin = pin;
    }

    public String getPin()
    {
        return this.pin;
    }

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

        return this.pin;
    }
    
    public void setPin(String pin) throws IOException
    {
        // Membuka file database 
        File file = new File("DatabaseDokter.txt");
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
                // receive name
                String nama = stringTokenizer.nextToken();
                // receive gender
                String jk = stringTokenizer.nextToken();
                // receive address
                String alamat = stringTokenizer.nextToken();
                // copy ke databaseTemp
                bufferedWriter.write(noRek + "," + pin + "," + nama + "," + jk + "," + alamat);
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

        // Delete database yang lama
        file.delete();
        // Karena database yang lama itu sudah di delete maka kita harus merenamenya seperti yang sebelum di delete tadi untuk database temp ini
        temp.renameTo(file);
    }
    
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
        }
        catch (Exception e){
            
        }
    }
    
    public void setHasil(String norek, int hasil){
        String path = "DatabaseBank.txt";
        String temp = "TempDatabase.txt";
        try {
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
        
        while(scan.hasNext())
        {
            noRek = scan.next();
            pin = scan.next();
            saldo = scan.next();
            username = scan.next();
            noHP = scan.next();
            email = scan.next();
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
        //fileAwal.delete();
        
       //Path fileAsli = Paths.get(path);
       //Path fileBaru = Paths.get(temp);
        
        
        //Files.move(fileBaru, fileBaru.resolveSibling(path));
        //fileTemp.delete();
        
        //File dump = new File(path);
        //fileTemp.renameTo(fileAwal);
        
        //if(fileTemp.renameTo(fileAwal))
        //{
        //    fileAwal.delet();
                    
        //}
        }
        catch (Exception e){
            
        }
    }
    
    
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
    
    public void akunBaru(ArrayList<String> dataUser)throws IOException{
        int random = (int) (Math.random() * (1000000 - 100000)) + 100000;
        // convert dia ke string karena data bilangan ini akan di simpan di file database beresktensi .txt
        String noRekening= Integer.toString(random);
        
        this.noRek = noRekening;
        
        FileWriter filewr = new FileWriter("DatabaseBank.txt", true);
        BufferedWriter bufferedWr = new BufferedWriter(filewr);
        
        bufferedWr.write(noRekening+ "," + dataUser.get(0) + "," + dataUser.get(1) + "," + dataUser.get(2) + "," + dataUser.get(3)+ "," + dataUser.get(4));
        bufferedWr.newLine();
        bufferedWr.flush();
        bufferedWr.close();
    }
    
    public boolean checkNoRek(String noRek) throws IOException{
        
        boolean adaData = true;
        FileReader fileR = new FileReader("DatabaseBank.txt");
        BufferedReader bufferedR = new BufferedReader(fileR);
        String data = bufferedR.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(data,",");
        
        while(data != null){
           stringTokenizer = new StringTokenizer(data,",");
           if(noRek.equals(stringTokenizer.nextToken())){
               adaData = true;
               break;
           }else{
               adaData = false;
           }
           data = bufferedR.readLine();
       }
        bufferedR.close();
        return adaData;
    }
    
    public boolean checkPin(String pin) throws IOException{
        
        boolean adaData = true;
        FileReader fileR = new FileReader("DatabaseBank.txt");
        BufferedReader bufferedR = new BufferedReader(fileR);
        String data = bufferedR.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(data,",");
        
        while(data != null){
           stringTokenizer = new StringTokenizer(data.substring(6),",");
           if(pin.equals(stringTokenizer.nextToken())){
               adaData = true;
               break;
           }else{
               adaData = false;
           }
           data = bufferedR.readLine();
       }
        bufferedR.close();
        return adaData;
    }
    
    public String getSaldo(){
        return this.saldo;
    }
    
    public String getUserName(){
        return this.username;
    }
    public String getNoHp(){
        return this.noHP;
    }
    public String getEmail(){
        return this.email;
    }
    public String getNomorRekening(){
        return this.noRek;
    }
}