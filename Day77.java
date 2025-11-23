public class Coding77 {
    public static void main(String[] args) {

        String teks = "  Halo Dunia Java  ";

        System.out.println("Teks asli: \"" + teks + "\"");

        // 1. trim() – menghapus spasi di awal dan akhir
        String trimmed = teks.trim();
        System.out.println("Setelah trim(): \"" + trimmed + "\"");

        // 2. substring() – mengambil sebagian string
        String sub = trimmed.substring(5, 10); // dari index 5 sampai 9
        System.out.println("substring(5, 10): \"" + sub + "\"");

        // 3. replace() – mengganti karakter/kata
        String diganti = trimmed.replace("Java", "Program");
        System.out.println("replace(\"Java\", \"Program\"): \"" + diganti + "\"");
    }
}
