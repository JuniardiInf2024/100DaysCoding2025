package juniardi;

import java.util.Scanner;

public class EvaluasiMentor2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print("* ");
            for (int j = 1; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int k = 1; k <= 5; k++) {
                for (int l = 1; l <= 5; l++) {
                    if(k == l) {
                        System.out.print("*  ");
                    }else {
                        System.out.print("#  ");
                    }
                }
                System.out.println();
        }
        Scanner juni = new Scanner (System.in);
        System.out.println("Masukkan Jam mulai pengerjaan : ");
        int mulai = juni.nextInt();
        System.out.println("Masukkan waktu pengerjaan : ");
        int selesai = juni.nextInt();

        int waktuTidur = (mulai+selesai)%24;
        int keluaran = 9 - waktuTidur;

        System.out.println(keluaran);

    }

}



