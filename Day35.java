package juniardi;
import java.util.Scanner;
public class Coding35 {
    public static void main(String[] args) {
        Scanner juni = new Scanner (System.in);
        System.out.print("Masukkan umur : ");
        int umur = juni.nextInt();
        
        if(umur>16){
            System.out.println("\nAnda diperbolehkan memasuki area.");
        }else{
            System.out.println("Berhentiiii, jangan kanjyut!!!");
        }
    }
    
}
