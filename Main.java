import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        penjual_2 s = new penjual_2();
        penjual_2= new Pembeli();
        //counter c = new Lapangan();
        Pilihlap i = new Pilihlap();
        bayar b = new bayar();
        struk q = new struk();

        System.out.println("Masukkan Nama Pembeli : ");
        String nama = r.nextLine();
        System.out.println("Masukkan no telp pembeli : ");
        int telp = r.nextInt();
        p.output(nama, telp);

        System.out.println("Masukkaan tanggal beli : ");
        int tglsewa = r.nextInt();
        s.output(tglsewa);

        System.out.println("Pilihan Lapangan : ");
        System.out.println("1. Lapangan Vinyl\n2.Lapangan Rumput sintetis");
        System.out.println("Masukkan pilihan anda : ");
        int inp= r.nextInt();
        i.piill(inp);

        System.out.println("Masukkan uang pembayaran");
        int uang = r.nextInt();
        System.out.println("jenis lapangan yang di bayar:\n1. counter Vynil\n2. counter 1");
        int pem = r.nextInt();
        b.penyewa(pem);

        q.pembeli(inp);
        q.piill(inp);
        q.strukk(nama,telp,tglsewa);
//        p.output();
//        s.output();
//        //l.output();
//        i.piill();
//        b.penyewa();

    }
}