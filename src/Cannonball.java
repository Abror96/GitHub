import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Abror on 28.05.2017.
 */
public class Cannonball {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num_cases = in.nextInt();
        ArrayList<String> results = new ArrayList<>();
        for(int i = 0; i<num_cases; i++){
            int v0 = in.nextInt();
            float f = in.nextFloat();
            float x1 = in.nextFloat();
            float h1 = in.nextFloat();
            float h2 = in.nextFloat();
            int h;

            int numerator = (int) (9.81 * Math.pow(x1,2));
            int denominator = (int) (2*Math.pow(v0,2)*Math.pow(Math.cos(Math.toRadians(f)),2));
            h = (int) (x1*Math.tan(Math.toRadians(f)))-(numerator/denominator);

            if(h>h1+1 && h<h2+1) results.add("Safe");
            else results.add("Not Safe");
        }
        for (String result : results)
            System.out.println(result);
    }
}
