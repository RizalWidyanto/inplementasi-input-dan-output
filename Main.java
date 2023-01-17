import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        penjualan s = new penjualan();
        pembeli p = new pembeli();

        Pilih_hp i = new Pilih_hp();
        bayar b = new bayar();
        struk q = new struk();

        System.out.println("Masukkan Nama pembeli : ");
        String nama = r.nextLine();
        System.out.println("Masukkan no telp pembeli : ");
        int telp = r.nextInt();
        p.output(nama, telp);

        System.out.println("Masukkaan tanggal beli : ");
        int tglbeli = r.nextInt();
        s.output(tglbeli);

        System.out.println("Pilihan Lapangan : ");
        System.out.println("1. konter 1\n2.konter 2");
        System.out.println("Masukkan pilihan anda : ");
        int inp= r.nextInt();
        i.piill(inp);

        System.out.println("Masukkan uang pembayaran");
        int uang = r.nextInt();
        System.out.println("jenis hp yang di bayar:\n1. konter 1\n2. konter 2");
        int pem = r.nextInt();
        b.penyewa(pem);

        q.penyewa(inp);
        q.piill(inp);
        q.strukk(nama,telp,tglbeli);
//        p.output();
//        s.output();
//        //l.output();
//        i.piill();
//        b.penyewa();

    }
}