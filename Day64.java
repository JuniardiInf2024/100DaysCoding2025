import java.util.Scanner;

public class Coding64 {
    public static void main(String[] args) {
        Scanner juni = new Scanner(System.in);
        System.out.print("Masukkan nilai M : ");
        int m = juni.nextInt();
        System.out.print("Masukkan nilai N : ");
        int n = juni.nextInt();
        int hasil = 1;

        System.out.println("Mencetak hasil " + m + " pangkat " + n);
        for(int i = 1; i <= n; i++){
            hasil *= m;
            if(i < n) {
                System.out.print(m + " x ");
            }else if(i == n) {
                System.out.print(m + " = ");
            }
        }
        System.out.println(hasil);
    }
}

