import java.util.Scanner;
public class Day73 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p;
        do {
            System.out.println("Menu:");
            System.out.println("1. BENSIN");
            System.out.println("2. OLI");
            System.out.println("3. EXIT");
            System.out.print("Masukkan angkanya: ");
            p = in.nextInt();

            switch (p) {
                case 1:
                    System.out.println("BENSIN MASIH ADA");
                    break;
                case 2:
                    System.out.println("OLI HABIS");
                    break;
                case 3:
                    System.out.println("SEHAT SELALU DADAH SAMPAI JUMPA");
                    break;
                default:
                    System.out.println("TIDAK ADA MENUNYA NYA ITU, ULANGI KI");
            }
        } while (p != 3);
       
    }
}
