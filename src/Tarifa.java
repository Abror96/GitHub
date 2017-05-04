import java.util.Scanner;

/**
 * Created by Abror on 03.05.2017.
 */
public class Tarifa {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int megabytes = in.nextInt();
        int n = in.nextInt();
        int spentMbytes[] = new int[n];
        int remaining = 0;
        for(int i = 0; i<n; i++){
            spentMbytes[i] = in.nextInt();
            remaining += megabytes - spentMbytes[i];
        }
        System.out.println(remaining+megabytes);

    }

}
