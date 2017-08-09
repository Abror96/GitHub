import java.util.Scanner;

/**
 * Created by Abror on 14.05.2017.
 */
public class rectangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] points = new int[6];
        for(int i = 0; i<6; i++){
            points[i] = in.nextInt();
        }
        int x4 = 0, y4 = 0;

        if(points[0] == points[2]) x4 = points[4];
        else if (points[0] == points[4]) x4 = points[2];
        else if (points[2] == points[4]) x4 = points[0];

        if(points[1] == points[3]) y4 = points[5];
        else if (points[1] == points[5]) y4 = points[3];
        else if (points[3] == points[5]) y4 = points[1];
        System.out.println(x4 + " " + y4);
    }
}
