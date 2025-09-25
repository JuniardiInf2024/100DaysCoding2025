package juniardi;
public class Coding18 {
    public static void main(String[] args) {
        byte angkaByte = 10;          
        short angkaShort;             
        int angkaInt;                 
        long angkaLong;               
        float angkaFloat;          
        double angkaDouble;           

        // Konversi otomatis
        angkaShort = angkaByte;       // byte  ke short
        angkaInt = angkaShort;        // short ke int
        angkaLong = angkaInt;         // int ke long
        angkaFloat = angkaLong;       // long ke float
        angkaDouble = angkaFloat;     // float ke double

        // Cetak hasil
        System.out.println("Nilai byte    : " + angkaByte);
        System.out.println("Nilai short   : " + angkaShort);
        System.out.println("Nilai int     : " + angkaInt);
        System.out.println("Nilai long    : " + angkaLong);
        System.out.println("Nilai float   : " + angkaFloat);
        System.out.println("Nilai double  : " + angkaDouble);
    }
}
