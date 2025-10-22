package juniardi;
import java.util.Scanner;
public class Coding45 {
    public static void main(String[] args) {
        Scanner juni = new Scanner(System.in);
        System.out.print("Pilih menu : ");
        String menu = juni.nextLine();

        switch (menu){
            case "Nasi campur":
                System.out.println("Mohon ditunggu. Pesanan akan segera dihidangkan.");
                break;

            case "Nasi goreng":
                System.out.println("Mohon ditunggu. Pesanan akan segera dihidangkan.");
                break;

            case "Mie goreng":
                System.out.println("Mohon ditunggu. Pesanan akan segera dihidangkan.");
                break;

            default:
                System.out.println("Menu tidak tersedia.");
                break;
        }
    }
}
