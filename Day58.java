import java.util.Scanner;
public class Coding58 {
    public static void main (String[] args){
        Scanner juni = new Scanner (System.in);
        System.out.println("Masukkan nilai N : ");
        int n = juni.nextInt();
        
        System.out.print("Mencetak angka 1 sampai N : ");
        for(int i = 1; i <= n; i++){
            System.out.print(i + " ") ;
        }
        System.out.println();
        System.out.print("Mencetak angka N sampai 1 : ");
        for(int j = n; j >= 1 ; j--){
            System.out.print(j + " ");
        }
    }
}
