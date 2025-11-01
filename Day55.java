import java.util.Scanner;

public class Evaluasi2 {
    public static void main(String[] args) {
        Scanner juni = new Scanner(System.in);
        
        System.out.println("Batas bawah  : ");
        int bawah = juni.nextInt();
       
        System.out.println("Batas atas   : ");
        int atas = juni.nextInt();
        
        System.out.println("Angka        : ");
        int angka = juni.nextInt();


        if(angka >= bawah && angka <= atas){
            System.out.println("YAYAYAYA");
        }else{
            System.out.println("NONONONO");
        }
    }
}
