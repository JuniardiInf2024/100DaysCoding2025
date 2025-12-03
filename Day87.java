import java.util.Scanner;

public class Coding87 {
    public static void main(String[] args) {
        int [] angka = {27, 9, 16, 20, 19};
        Scanner input = new Scanner(System.in);
        // Input elemen yang ingin dicari
        System.out.print("Masukkan elemen yang ingin dicari: ");
        int cari = input.nextInt();

        boolean ditemukan = false;
        int posisi = -1;

        // Pencarian elemen
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                ditemukan = true;
                posisi = i;
                break;
            }
        }

        // Output hasil
        if (ditemukan) {
            System.out.println("Elemen " + cari + " ditemukan pada indeks ke-" + posisi);
        } else {
            System.out.println("Elemen " + cari + " tidak ditemukan dalam array.");
        }
    }
}
