package Class;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Akun
{

    // Fields 
    private String pin;
    private String noRek;


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
}