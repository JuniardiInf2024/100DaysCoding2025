public class Coding96 {
    // Penjumlahan
    public static int tambah(int a, int b) {
        return a + b;
    }
    // Pengurangan
    public static int kurang(int a, int b) {
        return a - b;
    }
    // Perkalian
    public static int kali(int a, int b) {
        return a * b;
    }
    // Pembagian
    public static int bagi(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int x = 20;
        int y = 4;

        System.out.println("Bilangan 1 = " + x);
        System.out.println("Bilangan 2 = " + y);

        System.out.println("Penjumlahan = " + tambah(x, y));
        System.out.println("Pengurangan = " + kurang(x, y));
        System.out.println("Perkalian   = " + kali(x, y));
        System.out.println("Pembagian   = " + bagi(x, y));
    }
}
