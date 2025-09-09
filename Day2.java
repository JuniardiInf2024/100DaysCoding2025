package juniardi;
public class Coding2 {
    public static void main(String[] args) {
        // println -> mencetak lalu pindah baris
        System.out.println("Ini pakai println");
        System.out.println("Setelah println, ini di baris baru");

        // print -> mencetak tanpa pindah baris
        System.out.print("Ini pakai print");
        System.out.print(" -> masih di baris yang sama");
        System.out.println(); // membuat baris baru manual

        // printf -> mencetak dengan format tertentu
        String nama = "Juniardi";
        int umur = 20;
        double nilai = 95.75;

        System.out.printf("Nama: %s, Umur: %d, Nilai: %.2f\n", nama, umur, nilai);
    }
}
