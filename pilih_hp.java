import java.util.Scanner;

public class Pilihlap extends Lap1{
    Scanner  keyboard = new Scanner(System.in);

    String lapangan;

    @Override
    public void piill(int inp) {
        switch (inp)
        {
            case 1:

                System.out.println("Lapangan Vinyl");
                System.out.println("120.000/jam");
                break;
            case 2:
                System.out.println("Lapangan Rumput sintetis");
                System.out.println("100.000/jam");
                break;
            default:
                System.out.println("ngga ada bang");
                break;
        }
    }
}
