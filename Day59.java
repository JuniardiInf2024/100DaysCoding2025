import java.util.Scanner;
public class Coding59 {
    public static void main (String[] args){
        Scanner juni = new Scanner (System.in);
        System.out.print("Masukkan nilai N : ");
        int n = juni.nextInt();

        System.out.print("Mencetak angka ganjil 1 sampai N : ");
        for(int i = 1; i <= n; i++){
            if(i%2==1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Mencetak angka genap 1 sampai N : ");
        for(int j = 1; j <= n ; j++){
            if(j%2==0) {
                System.out.print(j + " ");
            }
        }
    }
}
