import java.util.Scanner;

/**
 * Created by Abror on 03.05.2017.
 */
public class Spavanac {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int hours = in.nextInt();
        int minutes = in.nextInt();

        if(minutes>=45 && minutes<=59) System.out.println(hours+" "+(minutes-45));
        else if (minutes>=0 && minutes<=44){
            if(hours == 0) System.out.println(23+" "+(minutes+15));
            else System.out.println((hours-1)+" "+(minutes+15));
        }
    }
}
