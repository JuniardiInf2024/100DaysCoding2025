import java.util.*;
public class EvaluasiMentor3 {
    public static
    void main(String[] args) {
//        int a = 1;
//        byte b = 2;
//        short c = 3;
//        long d = 4;
//        float e = 8.9f;
//        double f = 7.1;
//        char g = 'J';
//        boolean h = true;
//        String i = "Juniardi";
//
//        System.out.printf("Angka %d adalah dari tipe data byte.\n", a );
//        System.out.printf("Huruf %c adalah tipe data char.\n",g);
//        System.out.println(i + " adalah tipe data String.");
//        System.out.print("Tinggi badan saya " + e + " cm.\n");
//
//        for (int j = 3; j <= 100; j+=3) {
//          System.out.print(j + " ");
//            if(j%2==0){ //Jika J habis dibagi 2, maka cetak
//                System.out.print(j + " ");
//            }
//            if(j < 50)
//                System.out.print(j + " ");
//         }
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Masukkan warna lampu (merah/kuning/hijau): ");
//        String warna = input.nextLine();
//
//        switch (warna) {
//            case "Merah":
//                System.out.println("Berhenti!");
//                break;
//            case "Kuning":
//                System.out.println("Hati-hati, bersiap berhenti!");
//                break;
//            case "Hijau":
//                System.out.println("Silakan jalan!");
//                break;
//            default:
//                System.out.println("Warna tidak dikenal. Coba lagi!");
//        }
//    }
//}
//        Scanner juni = new Scanner(System.in);
//        System.out.print("Masukkan bilangan : ");
//        int bilangan = juni.nextInt();
//
//        String hasil = (bilangan % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
//
//        System.out.println("Hasil: " + hasil);
//    }
//}
        int a = 1;
        do {

            a++;
            if(a != 50){
                System.out.println(a);
                continue;

            }
            else if(a == 98){
                System.out.println(a);
                break;
            }

        }while (a < 101);
    }
}
