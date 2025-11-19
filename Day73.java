import java.util.Scanner;

public class Coding73 {
    public static void main(String[] args) {

        Scanner juni = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Hitung Penjumlahan");
            System.out.println("2. Hitung Perkalian");
            System.out.println("3. Tampilkan Salam");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = juni.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka pertama: ");
                    int a = juni.nextInt();
                    System.out.print("Masukkan angka kedua: ");
                    int b = juni.nextInt();
                    System.out.println("Hasil = " + (a + b));
                    break;

                case 2:
                    System.out.print("Masukkan angka pertama: ");
                    a = juni.nextInt();
                    System.out.print("Masukkan angka kedua: ");
                    b = juni.nextInt();
                    System.out.println("Hasil = " + (a * b));
                    break;

                case 3:
                    System.out.println("Halo! Semoga harimu menyenangkan!");
                    break;

                case 0:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi!");
            }

        } while (pilihan != 0);
    }
}
