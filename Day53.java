public class Coding53 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Perulangan berhenti di angka " + i);
                break;
            }
            System.out.println("Angka: " + i);
        }
        System.out.println("Program selesai.");
    }
}
