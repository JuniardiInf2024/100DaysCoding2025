public class Coding57 {
    public static void main(String[] args) {
        // Loop luar untuk baris
        for (int i = 1; i <= 5; i++) {
            // Loop dalam untuk kolom
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}
