import java.util.Scanner;

/**
 * Created by Abror on 11.05.2017.
 */
public class Ladder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int v = in.nextInt();
        int result = (int) Math.ceil(h/(Math.sin(Math.toRadians(v))));
        System.out.println(result);
    }

}
