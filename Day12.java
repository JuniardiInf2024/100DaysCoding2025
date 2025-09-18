package juniardi;
import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
        Scanner juni = new Scanner(System.in);

        System.out.println("Input Biodata");
        System.out.print("Masukkan Nama      : ");
        String nama = juni.nextLine();

        System.out.print("Masukkan NIM       : ");
        String nim = juni.nextLine();

        System.out.print("Angkatan           : ");
        int angkatan = juni.nextInt();

        System.out.print("Masukkan Nilai IPK : ");
        float ipk = juni.nextFloat();

        System.out.print("Masukkan Nilai IPS : ");
        double ips = juni.nextDouble();

        System.out.println("User bernama " + nama + ", dengan NIM " + nim + ". User adalah angkatan tahun " + angkatan + " dengan nilai IPK (Indeks Prestasi Kumulatif) " + ipk + " dan nilai IPS (Indeks Prestasi Semester) " + ips + ".");
    }
}
