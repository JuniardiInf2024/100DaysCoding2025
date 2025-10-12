package juniardi ;
import java.util.Scanner;
public class Day36 {
    public static void main(String[] args) {
        Scanner juni = new Scanner (System.in);
        System.out.print("Berapa umur Anda? \nJawab: ");
        int umur = juni.nextInt();
        
        if(umur>16){
            System.out.print("Apakah Anda sudah punya SIM? (Ya/Tidak) \nJawab: ");
            String sim = juni.next();
            if(sim.equalsIgnoreCase("Ya")){
                System.out.println("Anda boleh mengemudi.");
            }else{
                System.out.println("Anda sudah cukup umur, tapi belum memiliki SIM. Dilaranh mengemudi.");
            }
        }else{
            System.out.println("Anda belum cukup umur. Dilarang mengemudi");
        }
    }
}
