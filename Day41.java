package juniardi;
import java.util.Scanner;
public class Coding41 {
    public static void main(String[] args) {
        Scanner juni = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        double gaji = juni.nextDouble();
        System.out.print("Masukkan tunjangan : ");
        double tunjangan = juni.nextDouble();
        System.out.print("Masukkan potongan  : ");
        double potongan = juni.nextDouble();
        double gajiBersih = gaji + tunjangan - potongan;
        
        System.out.println("Gaji pokok  : " + gaji);
        System.out.println("Tunjangan   : " + tunjangan);
        System.out.println("Potongan    : " + potongan);
        System.out.println("Gaji bersih yang didapatkan : " + gajiBersih);
    }
}
