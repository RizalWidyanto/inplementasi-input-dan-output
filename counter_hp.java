import java.util.Scanner;

public class Lapangan{
    protected String jenlap;
    protected int nolap;

    public String getJenlap() {
        return jenlap;
    }

    public void setJenlap(String jenlap) {
        this.jenlap = jenlap;
    }

    public int getNolap() {
        return nolap;
    }
    public void setNolap(int nolap) {
        this.nolap = nolap;
    }
    public void output(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Penyewa : ");
        setNolap(input.nextInt());
        System.out.println("Masukkan no telp penyewa : ");
        setJenlap(input.next());
        System.out.println("Nama Penyewa : "+this.nolap);
        System.out.println("No telp penyewa : "+this.jenlap);
    }
}
