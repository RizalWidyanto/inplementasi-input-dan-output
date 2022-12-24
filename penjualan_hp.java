import java.util.Scanner;

public class Sewalapangan {
    private int tglsewa;

    public int getTglsewa() {
        return tglsewa;
    }

    public void setTglsewa(int tglsewa) {
        this.tglsewa = tglsewa;
    }

    public void output(int tglsewa){
        System.out.println("Masukkan tanggal sewa : "+tglsewa);
    }

}
