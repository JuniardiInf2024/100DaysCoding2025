package juniardi;

public class Coding14 {
    public static void main(String[] args) {
        // String yang akan dikonversi
        String satuInt = "123";
        String duaDouble = "123.45";
        String tigaBoolean = "true";
        String empatFloat = "12.34";

        // Konversi String ke tipe primitif
        int a = Integer.parseInt(satuInt);
        double b = Double.parseDouble(duaDouble);
        boolean c = Boolean.parseBoolean(tigaBoolean);
        float d = Float.parseFloat(empatFloat);
        
        // Menampilkan hasil
        System.out.println("Nilai int     : " + a);
        System.out.println("Nilai double  : " + b);
        System.out.println("Nilai boolean : " + c);
        System.out.println("Nilai float   : " + d);
        
    }
}
