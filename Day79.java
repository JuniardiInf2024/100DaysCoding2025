import java.util.Scanner;

public class Coding79 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // === Membuat Akun ===
        System.out.println("=== BUAT AKUN ===");
        System.out.print("Buat username : ");
        String buatUser = input.nextLine();

        System.out.print("Buat password : ");
        String buatPass = input.nextLine();

        System.out.println("\nAkun berhasil dibuat!\n");

        // === LOGIN ===
        String user, pass;

        System.out.println("=== LOGIN ===");

        while (true) {  // loop terus sampai username & password benar

            System.out.print("Masukkan username : ");
            user = input.nextLine();

            System.out.print("Masukkan password : ");
            pass = input.nextLine();

            // cek login
            if (user.equals(buatUser) && pass.equals(buatPass)) {
                System.out.println("\nLogin berhasil! Selamat datang " + user + "!");
                break;  // keluar dari loop
            } else {
                System.out.println("Username atau password salah! Coba lagi.\n");
            }
        }
    }
}

