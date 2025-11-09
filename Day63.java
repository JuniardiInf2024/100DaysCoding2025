import java.util.Scanner;

public class Coding63 {
    public static void main(String[] args) {
        Scanner juni = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int n = juni.nextInt();
        int jumlah = 1;
    
        System.out.println("Menjumlahkan 1 sampai " + n);
        for(int i = 1; i <= n; i++){
            jumlah *= i;
            if(i < n) {
                System.out.print(i + " x ");
            }else if (i == n){
                System.out.print(i + " = ");
            }
        }
        System.out.println(jumlah);
    }
}
