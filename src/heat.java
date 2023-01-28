import java.util.Scanner;
public class heat {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);

        double heat;
        System.out.print("Lütfen Hava Sıcaklığını giriniz : ");
        heat = inp.nextDouble();

        if (heat < 5){
            System.out.print("Kayak yapabilirsiniz.");
        }
        else if(heat >= 5 && heat < 15){
            System.out.print("Sinemaya Gidebilirsiniz.");
        }
        else if (heat == 15)
        {
            System.out.print("Sinemaya veya Pikniğe Gidebilirsiniz.");
        }
        else if (heat > 15 && heat <= 25 ){
            System.out.print("Pikniğe Gidebilirsiniz. ");
        }
        else{
            System.out.print("Yüzmeye Gidebilirsiniz. ");
        }
    }
}
