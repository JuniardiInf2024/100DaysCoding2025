import java.util.Scanner;
public class Coding100 {
    public static void main(String[] args) {
        Scanner juni = new Scanner(System.in);
        System.out.print("Masukkan kata/kalimat: ");
        String input = juni.nextLine();
        boolean huruf_I = false;
        boolean huruf_S = false;
        boolean huruf_C = false;

        for (int i = 0; i < input.length(); i++) {
            char karakter = input.charAt(i);
            if (karakter == 'I' && !huruf_I){
                huruf_I = true;
            }
            else if (karakter == 'S' && huruf_I && !huruf_S){
                huruf_S = true;
            }else if (karakter == 'C' && huruf_I && huruf_S){
                huruf_C = true;
                break;
            }
        }
        if(huruf_I && huruf_S && huruf_C){
            System.out.println("CANTIK");
        }else{
            System.out.println("TIDAK CANTIK");
        }
    }
}
