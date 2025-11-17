import java.util.Scanner;

public class Coding71 {
    public static void main(String[] args) {
        Scanner juni = new Scanner(System.in);
        System.out.print("Masukkan tingginya : ");
        int tinggi = juni.nextInt();
        System.out.print("Masukkan lebarnya : ");
        int lebar = juni.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            for (int j = i; j <= lebar; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
