import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Abror on 14.05.2017.
 */
public class Grass_seed {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cost = in.nextDouble();
        int n = in.nextInt();
        ArrayList<Double> size = new ArrayList<>();
        for(int i = 0; i<n*2; i++){
            size.add(in.nextDouble());
        }
        Double total = 0d;
        for(int i = 0; i<size.size(); i++){
            total += (size.get(i)*size.get(i+1))*cost;
            i++;
        }
        DecimalFormat df = new DecimalFormat();
        df.setRoundingMode(RoundingMode.UP);
        System.out.println(df.format(total));
    }

}
