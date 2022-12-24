import java.util.Scanner;

public class bayar implements  pembayaran{
    public int uang;
    public int total;
    public int kembalian;

    Scanner input = new Scanner(System.in);
    Scanner keyboard = new Scanner(System.in);
    public int getUang() {
        return uang;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }

    @Override
    public void penyewa(int pem) {
        switch (pem){
            case 1:
                total = 150000 - uang;
                kembalian = uang - total;
                System.out.println("TOTAL = " + total);
                System.out.println("kembalian = " + kembalian);
                break;
            case 2:
                total = uang - 110000;
                kembalian = total - uang;
                System.out.println("TOTAL = " + total);
                System.out.println("kembalian = " + kembalian);
                break;
            default:
                System.out.println("salah");
                break;
        }
    }

}