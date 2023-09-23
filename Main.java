import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km,tutar;
        double kmBasi=2.20;

        Scanner inp = new Scanner(System.in);
        System.out.print("lutfen gidilen km yi giriniz :");

        km=inp.nextDouble();
        tutar=10+(km*kmBasi);

        if(tutar<20){
            System.out.print(km +" Km yol gittiniz ve Ödenecek Tutar : " + tutar + " ama sizden 20 tl almak zorundayız ");
        }

        else{
            System.out.print(km + "Km yol gittiniz ve Ödemeniz gereken tutar :"+tutar);

        }



    }
}
