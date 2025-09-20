import java.util.Scanner;

public class EvaluasiMentor {
    public static void main(String[] args) {
        String nama = "Lestari", Program_Studi = "Informatika", Alamat = "Majene";
        final String nim = "D012345";
        double tinggiBadan = 149.7;
        float beratBadan = 40.6f ;
        short usia = 21;
        long ukt = 5000000;
        char golonganDarah = 'Z';
        boolean Keaktifan_Mahasiswa = false;
        int jarak_rumah_ke_kampus  = 13;
        byte jumlah_sks_yang_diambil = 20;

        System.out.println("Biodata Sebelum Diupdate: ");
        System.out.println("Nama                    : " + nama);
        System.out.println("NIM                     : " + nim);
        System.out.println("Program Studi           : " + Program_Studi);
        System.out.println("Alamat                  : " + Alamat);
        System.out.println("Tinggi Badan            : " + tinggiBadan + " cm");
        System.out.println("Berat Badan             : " + beratBadan + " cm");
        System.out.println("Usia                    : " + usia + " tahun");
        System.out.println("UKT                     : " + ukt);
        System.out.println("Golongan Darah          : " + golonganDarah);
        System.out.println("Keaktifan Mahasiswa     : " + Keaktifan_Mahasiswa);
        System.out.println("Jarak rumah ke kampus   : " + jarak_rumah_ke_kampus + " km");
        System.out.println("Jumlah SKS yang diambil : " + jumlah_sks_yang_diambil);


        System.out.println(" ");
        Scanner juniardi = new Scanner(System.in);

        System.out.print("Masukkan Nama           : ");
        nama = juniardi.nextLine();

        System.out.print("Masukkan Alamat         : ");
        Alamat = juniardi.nextLine();

        System.out.print("Masukkan Tinggi Badan   : ");
        tinggiBadan = juniardi.nextDouble();

        System.out.print("Masukkan jarak          : ");
        jarak_rumah_ke_kampus = juniardi.nextShort();

        System.out.print("Masukkan Golongan Darah : ");
        golonganDarah = juniardi.next().charAt(0);
//
//        System.out.println("Biodata Setelah Diupdate: ");
//        System.out.println("Nama                    : " + nama);
//        System.out.println("NIM                     : " + nim);
//        System.out.println("Program Studi           : " + Program_Studi);
//        System.out.println("Alamat                  : " + Alamat);
//        System.out.println("Tinggi Badan            : " + tinggiBadan + " cm");
//        System.out.println("Berat Badan             : " + beratBadan + " cm");
//        System.out.println("Usia                    : " + usia + " tahun");
//        System.out.println("UKT                     : " + ukt);
//        System.out.println("Golongan Darah          : " + golonganDarah);
//        System.out.println("Keaktifan Mahasiswa     : " + Keaktifan_Mahasiswa);
//        System.out.println("Jarak rumah ke kampus   : " + jarak_rumah_ke_kampus + " km");
//        System.out.println("Jumlah SKS yang diambil : " + jumlah_sks_yang_diambil);
//        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Biodata Setelah Diupdate: ");
        System.out.printf(
                "Nama                     : %s" +
                "%nNIM                     : %s" +
                "%nProgram Studi           : %s" +
                "%nAlamat                  : %s" +
                "%nTinggi badan            : %2f" +
                "%nBerat Badan             : %f" +
                "%nUsia                    : %d" +
                "%nUKT                     : %d" +
                "%nGolongan Darah          : %c" +
                "%nKeaktifan Mahasiswa     : %b" +
                "%nJarak rumah ke kampus   : %d" +
                "%nJumlah SKS yang diambil : %d", nama, nim, Program_Studi, Alamat, tinggiBadan, beratBadan, usia, ukt, golonganDarah, Keaktifan_Mahasiswa, jarak_rumah_ke_kampus, jumlah_sks_yang_diambil);

    } 
}
