import java.util.Scanner;

public class Coding99 {
    public static void main(String[] args) {
        Scanner juni = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int n = juni.nextInt();

        System.out.println("Bilangan prima dari 1 sampai " + n + " adalah : ");
        for (int i = 2; i <= n; i++) {
            int j;
            for (j = 2; j <= i / 2; j++)
                if (i % j == 0) break;

            if (j > i / 2)
                System.out.print(i + " ");
        }
    }
}
