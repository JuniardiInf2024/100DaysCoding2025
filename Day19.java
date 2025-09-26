package juniardi;

public class Coding19 {
    public static void main(String[] args) {
        double angkaDouble = 99.99;

        // konversi manual
        float angkaFloat = (float) angkaDouble;  
        int angkaInt = (int) angkaFloat;         
        byte angkaByte = (byte) angkaInt;        
        
        System.out.println("Nilai double : " + angkaDouble);
        System.out.println("Nilai float  : " + angkaFloat);
        System.out.println("Nilai int    : " + angkaInt);
        System.out.println("Nilai byte   : " + angkaByte);
    }
}
