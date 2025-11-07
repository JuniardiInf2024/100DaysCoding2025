import java.util.Scanner;

public class Coding61 {
    public static void main(String[] args) {
        Scanner juni = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int n = juni.nextInt();
        System.out.print("Masukkan nilai M : ");
        int m = juni.nextInt();

        System.out.print("Mencetak bilangan kelipatan M dari 1 sampai N : ");
        for(int i = 1; i <= n; i++){
            if(i%m==0) {
                System.out.print(i + " ");
            }
        }
    }
}
