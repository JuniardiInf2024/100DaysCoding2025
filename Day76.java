public class Coding76v2 {
    public static void main(String[] args) {
        String teks1 = "Saya adalah seorang mahasiswa";
        String teks2 = "Saya adalah Seorang mahasiswa";

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
    }
}

