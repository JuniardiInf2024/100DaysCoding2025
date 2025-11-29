public class Coding83 {
    public static void main(String[] args) {
        int[] angka = {27, 6, 0, 20, 5};
        int total = 0;

        for (int i = 0; i < angka.length; i++) {
            total += angka[i];
        }
        System.out.println("Total jumlah elemen : " + total);
    }
}
