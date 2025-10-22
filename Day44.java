package juniardi;

import java.util.Scanner;

public class Coding44{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan warna lampu (merah/kuning/hijau): ");
        String warna = input.nextLine();

        switch (warna) {
            case "Merah":
                System.out.println("Berhenti!");
                break;
            case "Kuning":
                System.out.println("Hati-hati, bersiap berhenti!");
                break;
            case "Hijau":
                System.out.println("Silakan jalan!");
                break;
            default:
                System.out.println("Warna tidak dikenal. Coba lagi!");
        }
    }
}
