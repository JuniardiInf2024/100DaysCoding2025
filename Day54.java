public class Coding54 {
    public static void main(String[] args) {
        System.out.println("Menampilkan angka 1 sampai 10, kecuali angka 5:");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // lewati angka 5
            }
            System.out.println(i);
        }
    }
}
