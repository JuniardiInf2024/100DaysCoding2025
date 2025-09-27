package juniardi;
public class Coding21 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Sebelum tukar, a bernilai " + a + ", dan b bernilai " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Setelah tukar, a bernilai " + a + ", dan b bernilai " + b);
    }
}
