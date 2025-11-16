import java.util.Scanner;
public class Coding70 {
    public static void main(String[] args) {
        
        Scanner juni = new Scanner (System.in);
        System.out.print("Masukkan nilai : ");
        int a = juni.nextInt();
        
        for (int i = 1; i <= a; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("+ ");
            }
        System.out.println();
        }
    }
    
}
