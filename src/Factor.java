import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Abror on 14.05.2017.
 */
public class Factor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int articles = in.nextInt();
        int impact_fact = in.nextInt();
        Double total = articles*(impact_fact-0.99d);
        DecimalFormat df = new DecimalFormat("#");
        df.setRoundingMode(RoundingMode.UP);
        System.out.println(df.format(total));
    }

}
