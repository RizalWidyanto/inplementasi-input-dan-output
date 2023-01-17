import java.util.Scanner;

public class Pilih_hp extends konter_1{
    Scanner  keyboard = new Scanner(System.in);

    String konter;

    @Override
    public void piill(int inp) {
        switch (inp)
        {
            case 1:

                System.out.println("konter_1");
                System.out.println("1.200.000/item");
                break;
            case 2:
                System.out.println("konter 2");
                System.out.println("1.000.000/jam");
                break;
            default:
                System.out.println("tidak ada bang");
                break;
        }
    }
}
