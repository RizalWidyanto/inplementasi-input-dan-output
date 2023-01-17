import java.util.Scanner;

public class konter{
    protected String jen_hp;
    protected int id_hp;

    public String getJen_hp() {
        return jen_hp;
    }

    public void setJen_hp(String jen_hp) {
        this.jen_hp = jen_hp;
    }

    public int getId_hp() {
        return id_hp;
    }
    public void setId_hp(int id_hp) {
        this.id_hp = id_hp;
    }
    public void output(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama pembeli : ");
        setId_hp(input.nextInt());
        System.out.println("Masukkan no telp pembeli : ");
        setJen_hp(input.next());
        System.out.println("Nama pembeli : "+this.id_hp);
        System.out.println("No telp pembeli : "+this.jen_hp);
    }
}
