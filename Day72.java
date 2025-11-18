import java.util.Scanner;

public class Coding72 {
    public static void main(String[] args) {
        Scanner juni = new Scanner(System.in);
        int jumlah = 0;
        while (true){
            System.out.print("Masukkan angka: ");
            int angka = juni.nextInt();
            if(angka < 0){
                break;
            }
            jumlah += angka;
        }
        System.out.println("Jumlah : " + jumlah);
    }
}
