import java.util.Scanner;

public class Coding47{
    public static void main(String[] args) {
        Scanner junj = new Scanner(System.in);
        System.out.print("Masukkan angka (1-7): ");
        int angka = juni.nextInt();
        String hari;

        switch (angka) {
            case 1:
                hari = "Senin";
                break;
            case 2:
                hari = "Selasa";
                break;
            case 3:
                hari = "Rabu";
                break;
            case 4:
                hari = "Kamis";
                break;
            case 5:
                hari = "Jumat";
                break;
            case 6:
                hari = "Sabtu";
                break;
            case 7:
                hari = "Minggu";
                break;
            default:
                hari = "Angka tidak valid! Harus 1–7.";
        }
        System.out.println("Hari ke-" + angka + " adalah: " + hari);
    }
}
