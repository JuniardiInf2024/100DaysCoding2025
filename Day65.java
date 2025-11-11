import java.util.Scanner;

public class Coding65 {
    public static void main(String[] args) {
        Scanner juni = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int n = juni.nextInt();
        int hasil = 1;

        System.out.println("Hasil dari " + n + " faktorial.");
        for(int i = n; i >= 1; i--){
            hasil *= i;
            if(i > 1) {
                System.out.print(i + " x ");
            }else if (i == 1){
                System.out.print(i + " = ");
            }
        }
        System.out.println(hasil);
    }
}
