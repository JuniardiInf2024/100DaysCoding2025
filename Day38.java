package juniardi;

import java.util.Scanner;

public class Coding38 {
    public static void main(String[] args) {
        Scanner juni = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int bilangan = juni.nextInt();

        if(bilangan>0){
            System.out.println("bilangan positif");
        } else if (bilangan<0) {
            System.out.println("bilangan negatif");
        }else{
            System.out.println("bilangan nol");
        }

    }

}
