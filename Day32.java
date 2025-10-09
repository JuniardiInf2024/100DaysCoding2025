package juniardi ;
import java.util.Scanner;
public class Dayy32 {
    public static void main(String[] args) {
        Scanner juni = new Scanner (System.in);
        System.out.println("Masukkan nilai : ");
        int nilai = juni.nextInt();
        if (nilai%5==0 || nilai%2==0){
            System.out.println("Nilai ini habis dibagi 5 atau habis dibagi 2");
        }else {
            System.out.println("Nilai tidak memenuhi syarat");
        }
    }
}
