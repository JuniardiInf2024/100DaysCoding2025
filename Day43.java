package juniardi;
import java.util.Scanner;

public class Coding43 {
    public static void main(String[] args) {
        Scanner juni = new Scanner(System.in);
        
        System.out.print("Masukkan nilai Anda : ");
        int nilai = juni.nextInt();
        String predikat;

        if (nilai >= 90) {
            predikat = "A";
        }else if (nilai >= 80) {
            predikat = "B";
        }else if (nilai >= 70) {
            predikat = "C";
        }else if (nilai >= 60) {
            predikat = "D";
        }else {
            predikat = "E";
        }
        System.out.println("=== HASIL ===");
        System.out.println("Nilai Anda   : " + nilai);
        System.out.println("Predikat Anda: " + predikat);
    }
}
