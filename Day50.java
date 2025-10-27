package juniardi;
import java.util.Scanner;

public class Coding50{
    public static void main(String[] args) {
        Scanner juni = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int bilangan = juni.nextInt();

        String hasil = (bilangan % 2 == 0) ? "bilangan genap" : "bilangan ganjil";

        System.out.println("Hasil: " + hasil);
    }
}
