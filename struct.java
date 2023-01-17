import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;

public class struk {

    String konter;
    int total, uang, kembalian;
    public void piill(int inp) {
        switch (inp)
        {
            case 1:
                this.konter = "konter_1";
                break;
            case 2:
                this.konter = "konter_2";
                break;
            default:
                System.out.println("ngga ada bang");
                break;
        }
    }

    public void pembeli(int pem) {
        switch (pem){
            case 1:
                this.total= 120000- uang;
                this.kembalian = uang-total;
                break;
            case 2:
                this.total = uang - 100000;
                this.kembalian = total - uang;
                break;
            default:
                System.out.println("salah");
                break;
        }
    }


    public void strukk(String nama,int notelp,int tgl) {
        try {
            FileWriter myWriter = new FileWriter("struk.txt");
            myWriter.write("Nama penyewa : " + nama+"\n");
            myWriter.write("NO telp : " + notelp+"\n");
            myWriter.write("Tanggal Sewa : " + tgl +"\n");
            myWriter.write("Jenis Lapangan " + this.konter+"\n");
            myWriter.write("uang Pembayaran : "+this.total+"\n");
            myWriter.write("uang kembalian : "+this.kembalian+"\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
