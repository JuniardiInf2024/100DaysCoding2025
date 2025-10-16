package juniardi;
import java.util.Scanner;

public class Coding39 {
    public static void main(String[] args) {
        Scanner juni = new Scanner(System.in);

        System.out.println("Menu Makanan");
        System.out.println("1. Nasi goreng");
        System.out.println("2. Mie ayam");
        System.out.println("3. Nasi Kuning");
        System.out.print("Masukkan pilihan Anda : ");
        int pilihan = juni.nextInt();

        System.out.println();

        if ( pilihan == 1){
            System.out.println("Anda pilih nasi goreng");
        } else if (pilihan == 2) {
            System.out.println("Anda pilih eie ayam");
        }else if (pilihan == 3) {
            System.out.println("Anda memilih nasi kuning");
        }else {
            System.out.println("Menu tidak ada");
        }
        System.out.println("TERIMA KASIH SUDAH MEMESAN!");
    }
}
