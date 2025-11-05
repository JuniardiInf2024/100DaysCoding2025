import java.util.Scanner;
public class Coding60 {
    public static void main (String[] args){
        Scanner juni = new Scanner (System.in);
        System.out.print("Masukkan nilai N : ");
        int n = juni.nextInt();

        System.out.print("Mencetak angka ganjil N sampai 1 : ");
        for(int i = n; i >= 1; i--){
            if(i%2==1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Mencetak angka genap N sampai 1 : ");
        for(int j = n; j >= 1; j--){
            if(j%2==0) {
                System.out.print(j + " ");
            }
        }
    }
}
