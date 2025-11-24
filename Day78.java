public class Coding78 {
    public static void main(String[] args) {
        String teks1 = " Belajar Java ";
        String teks2 = "Saya adalah Seorang mahasiswa";

        System.out.println("Kalimat asli     : " + teks1);
        System.out.println("Panjang kalimat  : " + teks1.length());
        System.out.println("Huruf besar      : " + teks1.toUpperCase());
        System.out.println("Huruf kecil      : " + teks1.toLowerCase());


        // equals()
        System.out.println("\n=== HASIL PENGECEKAN ===");
        System.out.println("equals()          : " + teks1.equals(teks2));

        // equalsIgnoreCase()
        System.out.println("equalsIgnoreCase(): " + teks1.equalsIgnoreCase(teks2));

        // contains()
        String cari = "Indonesia";
        System.out.print("\nKata yang ingin dicari dalam teks pertama adalah: " + cari);
        System.out.println("\ncontains()       : " + teks1.contains(cari));

        // isEmpty()
        System.out.println("\nPengecekan isEmpty():");
        System.out.println("Teks pertama kosong? : " + teks1.isEmpty());
        System.out.println("Teks kedua kosong?   : " + teks2.isEmpty());

        // trim() – menghapus spasi di awal dan akhir
        String trimmed = teks1.trim();
        System.out.println("Setelah trim(): \"" + trimmed + "\"");

        // substring() – mengambil sebagian string
        String sub = trimmed.substring(5, 10); // dari index 5 sampai 9
        System.out.println("substring(5, 10): \"" + sub + "\"");

        // replace() – mengganti karakter/kata
        String diganti = trimmed.replace("Java", "Matematika");
        System.out.println("replace(\"Java\", \"Matematika\"): \"" + diganti + "\"");

    }
}
