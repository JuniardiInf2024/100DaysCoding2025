import java.util.Scanner;
public class Coding27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai A = ");
        int a = sc.nextInt();
        System.out.print("Masukkan nilai B = ");
        int b = sc.nextInt();
        
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Sekarang A bernilai : " + a);
        System.out.println("Sekarang B bernilai : " + b);
    }
}
