package juniardi;
import java.util.Scanner;
public class Coding40 {
    public static void main(String[] args) {
        Scanner juni = new Scanner(System.in);
        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = juni.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = juni.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
        double angka2 = juni.nextDouble();
        double hasil;
                if (operator == '+') {
                    hasil = angka1 + angka2;
                    System.out.println("Hasil: " + hasil);
                }
                else if (operator == '-') {
                    hasil = angka1 - angka2;
                    System.out.println("Hasil: " + hasil);
                }
                else if (operator == '*') {
                    hasil = angka1 * angka2;
                    System.out.println("Hasil: " + hasil);
                }
                else if (operator == '/') {
                    if (angka1 != 0) {
                        hasil = angka1 / angka2;
                        System.out.println("Hasil: " + hasil);
                    }else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                    }
                }
                else {
                    System.out.println("Operator tidak dikenali!");
                }
    }
}
