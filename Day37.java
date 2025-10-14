package juniardi;
import java.util.Scanner;
public class Xay37 {
    
    public static void main(String[] args) {
        Scanner juni = new Scanner (System.in);
        System.out.println("Masukkan bilangan : ");
        int bilangan = juni.nextInt();
        
        if(bilangan%2==0){
            System.out.println(bilangan + " adalah bilangan genap");
        }else{
            System.out.println(bilangan + " adalah bilangan ganjil");
        }
    }
}
