package juniardi;
import java.util.Scanner;
public class Coding42 {
    public static void main(String[] args) {
        Scanner juni = new Scanner (System.in);
        System.out.print("Masukkan nilai N : ");
        int n = juni.nextInt();
        
        for(int i = 1; i <= n; i++){
        if(i%3==0 && i%5==0){
            System.out.println(i + " adalah bilangan kelipatan 3 dan 5");
        }else if(i%3==0){
            System.out.println(i + " adalah bilangan kelipatan 3.");
        }else if(i%5==0){
            System.out.println(i + " adalah bilangan kelipatan 5.");
        }
        }
    }
}
