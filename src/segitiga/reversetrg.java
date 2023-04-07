package segitiga;
import java.util.Scanner;

public class reversetrg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int jumlahBaris = input.nextInt();

        for (int i = jumlahBaris; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
